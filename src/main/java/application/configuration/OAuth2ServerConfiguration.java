/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package application.configuration;

import application.service.security.RepositoryUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.security.SpringSocialConfigurer;

import javax.sql.DataSource;

@Configuration
@EnableSocial
public class OAuth2ServerConfiguration {

	private static final String RESOURCE_ID = "restservice";

	@Configuration
	@EnableResourceServer
	@EnableSocial
	protected static class ResourceServerConfiguration extends
			ResourceServerConfigurerAdapter {

		@Override
		public void configure(ResourceServerSecurityConfigurer resources) {
			resources
				.resourceId(RESOURCE_ID);
		}

		@Override
		public void configure(HttpSecurity http) throws Exception {
			http
				.authorizeRequests()
					.antMatchers("/blabla").hasRole("ADMIN")
					.antMatchers("/greeting").authenticated().and()
                .apply(new SpringSocialConfigurer());
		}

	}

	@Configuration
	@EnableAuthorizationServer
	@EnableSocial
	protected static class AuthorizationServerConfiguration extends
			AuthorizationServerConfigurerAdapter {


		@Autowired
		private AuthenticationManager authenticationManager;

		@Autowired
		private RepositoryUserDetailsService userDetailsService;

		@Autowired
		@SuppressWarnings("SpringJavaAutowiringInspection")
		private DataSource dataSource;

		@Bean
		public TokenStore tokenStore() {
			return new JdbcTokenStore(dataSource);
		}

		@Override
		public void configure(AuthorizationServerEndpointsConfigurer endpoints)
				throws Exception {
			endpoints
				.tokenStore(tokenStore())
				.authenticationManager(this.authenticationManager)
				.userDetailsService(userDetailsService);
		}

		@Override
		public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
			clients
				.inMemory()
					.withClient("clientapp")
						.authorizedGrantTypes("password", "refresh_token")
						.authorities("USER")
						.scopes("read", "write")
						.resourceIds(RESOURCE_ID)
						.secret("123456")
						.autoApprove(true)
						.accessTokenValiditySeconds(86400)
						.refreshTokenValiditySeconds(90000);
		}

		@Bean
		@Primary
		public DefaultTokenServices tokenServices() {
			DefaultTokenServices tokenServices = new DefaultTokenServices();
			tokenServices.setSupportRefreshToken(true);
			tokenServices.setTokenStore(tokenStore());
			return tokenServices;
		}

	}

}
