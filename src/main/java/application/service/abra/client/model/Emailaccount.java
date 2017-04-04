/**
 * abra gen web api (spojení testapi)
 * webové api systému 17.03.03
 *
 * OpenAPI spec version: 17.03.03
 * Contact: abragen@abra.eu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package application.service.abra.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * Emailaccount
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Emailaccount   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("accountname")
  private String accountname = null;

  @SerializedName("accountaddress")
  private String accountaddress = null;

  @SerializedName("login")
  private String login = null;

  @SerializedName("secpassword")
  private String secpassword = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("server")
  private String server = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("leavemsgonserver")
  private Boolean leavemsgonserver = null;

  @SerializedName("emailsmtpaccount_id")
  private String emailsmtpaccountId = null;

  @SerializedName("receivedmaildocqueue_id")
  private String receivedmaildocqueueId = null;

  @SerializedName("sendmaildocqueue_id")
  private String sendmaildocqueueId = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  @SerializedName("defaulttext")
  private String defaulttext = null;

  @SerializedName("maxsizelimit")
  private Integer maxsizelimit = null;

  @SerializedName("owner_id")
  private String ownerId = null;

  @SerializedName("connectionsecurity")
  private Integer connectionsecurity = null;

  @SerializedName("accounttype")
  private Integer accounttype = null;

  @SerializedName("personaldeliverydocqueue_id")
  private String personaldeliverydocqueueId = null;

  @SerializedName("usecredentialstoreceive")
  private Boolean usecredentialstoreceive = null;

  @SerializedName("usecredentialstosending")
  private Boolean usecredentialstosending = null;

  @SerializedName("accounttypename")
  private String accounttypename = null;

  @SerializedName("testdatabox")
  private Boolean testdatabox = null;

  @SerializedName("databoxtype")
  private Integer databoxtype = null;

  @SerializedName("effectiveovm")
  private Boolean effectiveovm = null;

  @SerializedName("defaulttextsavedas")
  private Integer defaulttextsavedas = null;

  public Emailaccount displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * název
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "název")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Emailaccount id(String id) {
    this.id = id;
    return this;
  }

   /**
   * vlastní id [persistentní položka]
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "vlastní id [persistentní položka]")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Emailaccount classid(String classid) {
    this.classid = classid;
    return this;
  }

   /**
   * id třídy
   * @return classid
  **/
  @ApiModelProperty(example = "null", value = "id třídy")
  public String getClassid() {
    return classid;
  }

  public void setClassid(String classid) {
    this.classid = classid;
  }

  public Emailaccount objversion(Integer objversion) {
    this.objversion = objversion;
    return this;
  }

   /**
   * verze objektu [persistentní položka]
   * @return objversion
  **/
  @ApiModelProperty(example = "null", value = "verze objektu [persistentní položka]")
  public Integer getObjversion() {
    return objversion;
  }

  public void setObjversion(Integer objversion) {
    this.objversion = objversion;
  }

  public Emailaccount hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * skrytý [persistentní položka]
   * @return hidden
  **/
  @ApiModelProperty(example = "null", value = "skrytý [persistentní položka]")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public Emailaccount accountname(String accountname) {
    this.accountname = accountname;
    return this;
  }

   /**
   * název účtu [persistentní položka]
   * @return accountname
  **/
  @ApiModelProperty(example = "null", value = "název účtu [persistentní položka]")
  public String getAccountname() {
    return accountname;
  }

  public void setAccountname(String accountname) {
    this.accountname = accountname;
  }

  public Emailaccount accountaddress(String accountaddress) {
    this.accountaddress = accountaddress;
    return this;
  }

   /**
   * e-mailová adresa [persistentní položka]
   * @return accountaddress
  **/
  @ApiModelProperty(example = "null", value = "e-mailová adresa [persistentní položka]")
  public String getAccountaddress() {
    return accountaddress;
  }

  public void setAccountaddress(String accountaddress) {
    this.accountaddress = accountaddress;
  }

  public Emailaccount login(String login) {
    this.login = login;
    return this;
  }

   /**
   * přihlašovací jméno [persistentní položka]
   * @return login
  **/
  @ApiModelProperty(example = "null", value = "přihlašovací jméno [persistentní položka]")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public Emailaccount secpassword(String secpassword) {
    this.secpassword = secpassword;
    return this;
  }

   /**
   * zakódované heslo [persistentní položka]
   * @return secpassword
  **/
  @ApiModelProperty(example = "null", value = "zakódované heslo [persistentní položka]")
  public String getSecpassword() {
    return secpassword;
  }

  public void setSecpassword(String secpassword) {
    this.secpassword = secpassword;
  }

  public Emailaccount password(String password) {
    this.password = password;
    return this;
  }

   /**
   * heslo
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "heslo")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Emailaccount server(String server) {
    this.server = server;
    return this;
  }

   /**
   * pop3 server [persistentní položka]
   * @return server
  **/
  @ApiModelProperty(example = "null", value = "pop3 server [persistentní položka]")
  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }

  public Emailaccount port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * port [persistentní položka]
   * @return port
  **/
  @ApiModelProperty(example = "null", value = "port [persistentní položka]")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public Emailaccount leavemsgonserver(Boolean leavemsgonserver) {
    this.leavemsgonserver = leavemsgonserver;
    return this;
  }

   /**
   * nemazat zprávy na serveru [persistentní položka]
   * @return leavemsgonserver
  **/
  @ApiModelProperty(example = "null", value = "nemazat zprávy na serveru [persistentní položka]")
  public Boolean getLeavemsgonserver() {
    return leavemsgonserver;
  }

  public void setLeavemsgonserver(Boolean leavemsgonserver) {
    this.leavemsgonserver = leavemsgonserver;
  }

  public Emailaccount emailsmtpaccountId(String emailsmtpaccountId) {
    this.emailsmtpaccountId = emailsmtpaccountId;
    return this;
  }

   /**
   * Účet odchozího serveru smtp; id objektu e-mailový účet odchozího serveru smtp [persistentní položka]
   * @return emailsmtpaccountId
  **/
  @ApiModelProperty(example = "null", value = "Účet odchozího serveru smtp; id objektu e-mailový účet odchozího serveru smtp [persistentní položka]")
  public String getEmailsmtpaccountId() {
    return emailsmtpaccountId;
  }

  public void setEmailsmtpaccountId(String emailsmtpaccountId) {
    this.emailsmtpaccountId = emailsmtpaccountId;
  }

  public Emailaccount receivedmaildocqueueId(String receivedmaildocqueueId) {
    this.receivedmaildocqueueId = receivedmaildocqueueId;
    return this;
  }

   /**
   * Řada dokladů doručených e-mailů; id objektu Řada dokladů [persistentní položka]
   * @return receivedmaildocqueueId
  **/
  @ApiModelProperty(example = "null", value = "Řada dokladů doručených e-mailů; id objektu Řada dokladů [persistentní položka]")
  public String getReceivedmaildocqueueId() {
    return receivedmaildocqueueId;
  }

  public void setReceivedmaildocqueueId(String receivedmaildocqueueId) {
    this.receivedmaildocqueueId = receivedmaildocqueueId;
  }

  public Emailaccount sendmaildocqueueId(String sendmaildocqueueId) {
    this.sendmaildocqueueId = sendmaildocqueueId;
    return this;
  }

   /**
   * Řada dokladů odeslaných e-mailů; id objektu Řada dokladů [persistentní položka]
   * @return sendmaildocqueueId
  **/
  @ApiModelProperty(example = "null", value = "Řada dokladů odeslaných e-mailů; id objektu Řada dokladů [persistentní položka]")
  public String getSendmaildocqueueId() {
    return sendmaildocqueueId;
  }

  public void setSendmaildocqueueId(String sendmaildocqueueId) {
    this.sendmaildocqueueId = sendmaildocqueueId;
  }

  public Emailaccount divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }

   /**
   * středisko; id objektu středisko [persistentní položka]
   * @return divisionId
  **/
  @ApiModelProperty(example = "null", value = "středisko; id objektu středisko [persistentní položka]")
  public String getDivisionId() {
    return divisionId;
  }

  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  public Emailaccount busorderId(String busorderId) {
    this.busorderId = busorderId;
    return this;
  }

   /**
   * zakázka; id objektu zakázka [persistentní položka]
   * @return busorderId
  **/
  @ApiModelProperty(example = "null", value = "zakázka; id objektu zakázka [persistentní položka]")
  public String getBusorderId() {
    return busorderId;
  }

  public void setBusorderId(String busorderId) {
    this.busorderId = busorderId;
  }

  public Emailaccount bustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
    return this;
  }

   /**
   * obch. případ; id objektu obchodní případ [persistentní položka]
   * @return bustransactionId
  **/
  @ApiModelProperty(example = "null", value = "obch. případ; id objektu obchodní případ [persistentní položka]")
  public String getBustransactionId() {
    return bustransactionId;
  }

  public void setBustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
  }

  public Emailaccount busprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
    return this;
  }

   /**
   * projekt; id objektu projekt [persistentní položka]
   * @return busprojectId
  **/
  @ApiModelProperty(example = "null", value = "projekt; id objektu projekt [persistentní položka]")
  public String getBusprojectId() {
    return busprojectId;
  }

  public void setBusprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
  }

  public Emailaccount defaulttext(String defaulttext) {
    this.defaulttext = defaulttext;
    return this;
  }

   /**
   * výchozí text [persistentní položka]
   * @return defaulttext
  **/
  @ApiModelProperty(example = "null", value = "výchozí text [persistentní položka]")
  public String getDefaulttext() {
    return defaulttext;
  }

  public void setDefaulttext(String defaulttext) {
    this.defaulttext = defaulttext;
  }

  public Emailaccount maxsizelimit(Integer maxsizelimit) {
    this.maxsizelimit = maxsizelimit;
    return this;
  }

   /**
   * max. velikost přílohy (mb) [persistentní položka]
   * @return maxsizelimit
  **/
  @ApiModelProperty(example = "null", value = "max. velikost přílohy (mb) [persistentní položka]")
  public Integer getMaxsizelimit() {
    return maxsizelimit;
  }

  public void setMaxsizelimit(Integer maxsizelimit) {
    this.maxsizelimit = maxsizelimit;
  }

  public Emailaccount ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * vlastník účtu; id objektu uživatel [persistentní položka]
   * @return ownerId
  **/
  @ApiModelProperty(example = "null", value = "vlastník účtu; id objektu uživatel [persistentní položka]")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public Emailaccount connectionsecurity(Integer connectionsecurity) {
    this.connectionsecurity = connectionsecurity;
    return this;
  }

   /**
   * zabezpečení [persistentní položka]
   * @return connectionsecurity
  **/
  @ApiModelProperty(example = "null", value = "zabezpečení [persistentní položka]")
  public Integer getConnectionsecurity() {
    return connectionsecurity;
  }

  public void setConnectionsecurity(Integer connectionsecurity) {
    this.connectionsecurity = connectionsecurity;
  }

  public Emailaccount accounttype(Integer accounttype) {
    this.accounttype = accounttype;
    return this;
  }

   /**
   * typ účtu [persistentní položka]
   * @return accounttype
  **/
  @ApiModelProperty(example = "null", value = "typ účtu [persistentní položka]")
  public Integer getAccounttype() {
    return accounttype;
  }

  public void setAccounttype(Integer accounttype) {
    this.accounttype = accounttype;
  }

  public Emailaccount personaldeliverydocqueueId(String personaldeliverydocqueueId) {
    this.personaldeliverydocqueueId = personaldeliverydocqueueId;
    return this;
  }

   /**
   * Řada dokladů datových zpráv do vl. rukou; id objektu Řada dokladů [persistentní položka]
   * @return personaldeliverydocqueueId
  **/
  @ApiModelProperty(example = "null", value = "Řada dokladů datových zpráv do vl. rukou; id objektu Řada dokladů [persistentní položka]")
  public String getPersonaldeliverydocqueueId() {
    return personaldeliverydocqueueId;
  }

  public void setPersonaldeliverydocqueueId(String personaldeliverydocqueueId) {
    this.personaldeliverydocqueueId = personaldeliverydocqueueId;
  }

  public Emailaccount usecredentialstoreceive(Boolean usecredentialstoreceive) {
    this.usecredentialstoreceive = usecredentialstoreceive;
    return this;
  }

   /**
   * automaticky použít přihlašovací údaje pro příjem datových zpráv. [persistentní položka]
   * @return usecredentialstoreceive
  **/
  @ApiModelProperty(example = "null", value = "automaticky použít přihlašovací údaje pro příjem datových zpráv. [persistentní položka]")
  public Boolean getUsecredentialstoreceive() {
    return usecredentialstoreceive;
  }

  public void setUsecredentialstoreceive(Boolean usecredentialstoreceive) {
    this.usecredentialstoreceive = usecredentialstoreceive;
  }

  public Emailaccount usecredentialstosending(Boolean usecredentialstosending) {
    this.usecredentialstosending = usecredentialstosending;
    return this;
  }

   /**
   * automaticky použít přihlašovací údaje pro odeslání datových zpráv. [persistentní položka]
   * @return usecredentialstosending
  **/
  @ApiModelProperty(example = "null", value = "automaticky použít přihlašovací údaje pro odeslání datových zpráv. [persistentní položka]")
  public Boolean getUsecredentialstosending() {
    return usecredentialstosending;
  }

  public void setUsecredentialstosending(Boolean usecredentialstosending) {
    this.usecredentialstosending = usecredentialstosending;
  }

  public Emailaccount accounttypename(String accounttypename) {
    this.accounttypename = accounttypename;
    return this;
  }

   /**
   * typ účtu - název
   * @return accounttypename
  **/
  @ApiModelProperty(example = "null", value = "typ účtu - název")
  public String getAccounttypename() {
    return accounttypename;
  }

  public void setAccounttypename(String accounttypename) {
    this.accounttypename = accounttypename;
  }

  public Emailaccount testdatabox(Boolean testdatabox) {
    this.testdatabox = testdatabox;
    return this;
  }

   /**
   * testovací účet datových schránek [persistentní položka]
   * @return testdatabox
  **/
  @ApiModelProperty(example = "null", value = "testovací účet datových schránek [persistentní položka]")
  public Boolean getTestdatabox() {
    return testdatabox;
  }

  public void setTestdatabox(Boolean testdatabox) {
    this.testdatabox = testdatabox;
  }

  public Emailaccount databoxtype(Integer databoxtype) {
    this.databoxtype = databoxtype;
    return this;
  }

   /**
   * typ datové schránky [persistentní položka]
   * @return databoxtype
  **/
  @ApiModelProperty(example = "null", value = "typ datové schránky [persistentní položka]")
  public Integer getDataboxtype() {
    return databoxtype;
  }

  public void setDataboxtype(Integer databoxtype) {
    this.databoxtype = databoxtype;
  }

  public Emailaccount effectiveovm(Boolean effectiveovm) {
    this.effectiveovm = effectiveovm;
    return this;
  }

   /**
   * možno odesílat zprávy jako ovm [persistentní položka]
   * @return effectiveovm
  **/
  @ApiModelProperty(example = "null", value = "možno odesílat zprávy jako ovm [persistentní položka]")
  public Boolean getEffectiveovm() {
    return effectiveovm;
  }

  public void setEffectiveovm(Boolean effectiveovm) {
    this.effectiveovm = effectiveovm;
  }

  public Emailaccount defaulttextsavedas(Integer defaulttextsavedas) {
    this.defaulttextsavedas = defaulttextsavedas;
    return this;
  }

   /**
   * výchozí text uložit jako [persistentní položka]
   * @return defaulttextsavedas
  **/
  @ApiModelProperty(example = "null", value = "výchozí text uložit jako [persistentní položka]")
  public Integer getDefaulttextsavedas() {
    return defaulttextsavedas;
  }

  public void setDefaulttextsavedas(Integer defaulttextsavedas) {
    this.defaulttextsavedas = defaulttextsavedas;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emailaccount emailaccount = (Emailaccount) o;
    return Objects.equals(this.displayname, emailaccount.displayname) &&
        Objects.equals(this.id, emailaccount.id) &&
        Objects.equals(this.classid, emailaccount.classid) &&
        Objects.equals(this.objversion, emailaccount.objversion) &&
        Objects.equals(this.hidden, emailaccount.hidden) &&
        Objects.equals(this.accountname, emailaccount.accountname) &&
        Objects.equals(this.accountaddress, emailaccount.accountaddress) &&
        Objects.equals(this.login, emailaccount.login) &&
        Objects.equals(this.secpassword, emailaccount.secpassword) &&
        Objects.equals(this.password, emailaccount.password) &&
        Objects.equals(this.server, emailaccount.server) &&
        Objects.equals(this.port, emailaccount.port) &&
        Objects.equals(this.leavemsgonserver, emailaccount.leavemsgonserver) &&
        Objects.equals(this.emailsmtpaccountId, emailaccount.emailsmtpaccountId) &&
        Objects.equals(this.receivedmaildocqueueId, emailaccount.receivedmaildocqueueId) &&
        Objects.equals(this.sendmaildocqueueId, emailaccount.sendmaildocqueueId) &&
        Objects.equals(this.divisionId, emailaccount.divisionId) &&
        Objects.equals(this.busorderId, emailaccount.busorderId) &&
        Objects.equals(this.bustransactionId, emailaccount.bustransactionId) &&
        Objects.equals(this.busprojectId, emailaccount.busprojectId) &&
        Objects.equals(this.defaulttext, emailaccount.defaulttext) &&
        Objects.equals(this.maxsizelimit, emailaccount.maxsizelimit) &&
        Objects.equals(this.ownerId, emailaccount.ownerId) &&
        Objects.equals(this.connectionsecurity, emailaccount.connectionsecurity) &&
        Objects.equals(this.accounttype, emailaccount.accounttype) &&
        Objects.equals(this.personaldeliverydocqueueId, emailaccount.personaldeliverydocqueueId) &&
        Objects.equals(this.usecredentialstoreceive, emailaccount.usecredentialstoreceive) &&
        Objects.equals(this.usecredentialstosending, emailaccount.usecredentialstosending) &&
        Objects.equals(this.accounttypename, emailaccount.accounttypename) &&
        Objects.equals(this.testdatabox, emailaccount.testdatabox) &&
        Objects.equals(this.databoxtype, emailaccount.databoxtype) &&
        Objects.equals(this.effectiveovm, emailaccount.effectiveovm) &&
        Objects.equals(this.defaulttextsavedas, emailaccount.defaulttextsavedas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, hidden, accountname, accountaddress, login, secpassword, password, server, port, leavemsgonserver, emailsmtpaccountId, receivedmaildocqueueId, sendmaildocqueueId, divisionId, busorderId, bustransactionId, busprojectId, defaulttext, maxsizelimit, ownerId, connectionsecurity, accounttype, personaldeliverydocqueueId, usecredentialstoreceive, usecredentialstosending, accounttypename, testdatabox, databoxtype, effectiveovm, defaulttextsavedas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emailaccount {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    accountname: ").append(toIndentedString(accountname)).append("\n");
    sb.append("    accountaddress: ").append(toIndentedString(accountaddress)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    secpassword: ").append(toIndentedString(secpassword)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    leavemsgonserver: ").append(toIndentedString(leavemsgonserver)).append("\n");
    sb.append("    emailsmtpaccountId: ").append(toIndentedString(emailsmtpaccountId)).append("\n");
    sb.append("    receivedmaildocqueueId: ").append(toIndentedString(receivedmaildocqueueId)).append("\n");
    sb.append("    sendmaildocqueueId: ").append(toIndentedString(sendmaildocqueueId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    busorderId: ").append(toIndentedString(busorderId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    busprojectId: ").append(toIndentedString(busprojectId)).append("\n");
    sb.append("    defaulttext: ").append(toIndentedString(defaulttext)).append("\n");
    sb.append("    maxsizelimit: ").append(toIndentedString(maxsizelimit)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    connectionsecurity: ").append(toIndentedString(connectionsecurity)).append("\n");
    sb.append("    accounttype: ").append(toIndentedString(accounttype)).append("\n");
    sb.append("    personaldeliverydocqueueId: ").append(toIndentedString(personaldeliverydocqueueId)).append("\n");
    sb.append("    usecredentialstoreceive: ").append(toIndentedString(usecredentialstoreceive)).append("\n");
    sb.append("    usecredentialstosending: ").append(toIndentedString(usecredentialstosending)).append("\n");
    sb.append("    accounttypename: ").append(toIndentedString(accounttypename)).append("\n");
    sb.append("    testdatabox: ").append(toIndentedString(testdatabox)).append("\n");
    sb.append("    databoxtype: ").append(toIndentedString(databoxtype)).append("\n");
    sb.append("    effectiveovm: ").append(toIndentedString(effectiveovm)).append("\n");
    sb.append("    defaulttextsavedas: ").append(toIndentedString(defaulttextsavedas)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
