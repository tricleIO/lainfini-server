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
 * Autoserversetting
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Autoserversetting   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("emailaccount_id")
  private String emailaccountId = null;

  @SerializedName("defaultuser_id")
  private String defaultuserId = null;

  @SerializedName("refreshinterval")
  private Integer refreshinterval = null;

  @SerializedName("poolsize")
  private Integer poolsize = null;

  @SerializedName("isactive")
  private Boolean isactive = null;

  @SerializedName("site")
  private String site = null;

  public Autoserversetting displayname(String displayname) {
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

  public Autoserversetting id(String id) {
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

  public Autoserversetting classid(String classid) {
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

  public Autoserversetting objversion(Integer objversion) {
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

  public Autoserversetting emailaccountId(String emailaccountId) {
    this.emailaccountId = emailaccountId;
    return this;
  }

   /**
   * e-mailový účet; id objektu e-mailový účet [persistentní položka]
   * @return emailaccountId
  **/
  @ApiModelProperty(example = "null", value = "e-mailový účet; id objektu e-mailový účet [persistentní položka]")
  public String getEmailaccountId() {
    return emailaccountId;
  }

  public void setEmailaccountId(String emailaccountId) {
    this.emailaccountId = emailaccountId;
  }

  public Autoserversetting defaultuserId(String defaultuserId) {
    this.defaultuserId = defaultuserId;
    return this;
  }

   /**
   * výchozí uživatel; id objektu uživatel [persistentní položka]
   * @return defaultuserId
  **/
  @ApiModelProperty(example = "null", value = "výchozí uživatel; id objektu uživatel [persistentní položka]")
  public String getDefaultuserId() {
    return defaultuserId;
  }

  public void setDefaultuserId(String defaultuserId) {
    this.defaultuserId = defaultuserId;
  }

  public Autoserversetting refreshinterval(Integer refreshinterval) {
    this.refreshinterval = refreshinterval;
    return this;
  }

   /**
   * interval občerstvení [persistentní položka]
   * @return refreshinterval
  **/
  @ApiModelProperty(example = "null", value = "interval občerstvení [persistentní položka]")
  public Integer getRefreshinterval() {
    return refreshinterval;
  }

  public void setRefreshinterval(Integer refreshinterval) {
    this.refreshinterval = refreshinterval;
  }

  public Autoserversetting poolsize(Integer poolsize) {
    this.poolsize = poolsize;
    return this;
  }

   /**
   * počet úloh [persistentní položka]
   * @return poolsize
  **/
  @ApiModelProperty(example = "null", value = "počet úloh [persistentní položka]")
  public Integer getPoolsize() {
    return poolsize;
  }

  public void setPoolsize(Integer poolsize) {
    this.poolsize = poolsize;
  }

  public Autoserversetting isactive(Boolean isactive) {
    this.isactive = isactive;
    return this;
  }

   /**
   * aktivní [persistentní položka]
   * @return isactive
  **/
  @ApiModelProperty(example = "null", value = "aktivní [persistentní položka]")
  public Boolean getIsactive() {
    return isactive;
  }

  public void setIsactive(Boolean isactive) {
    this.isactive = isactive;
  }

  public Autoserversetting site(String site) {
    this.site = site;
    return this;
  }

   /**
   * replikační hnízdo [persistentní položka]
   * @return site
  **/
  @ApiModelProperty(example = "null", value = "replikační hnízdo [persistentní položka]")
  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Autoserversetting autoserversetting = (Autoserversetting) o;
    return Objects.equals(this.displayname, autoserversetting.displayname) &&
        Objects.equals(this.id, autoserversetting.id) &&
        Objects.equals(this.classid, autoserversetting.classid) &&
        Objects.equals(this.objversion, autoserversetting.objversion) &&
        Objects.equals(this.emailaccountId, autoserversetting.emailaccountId) &&
        Objects.equals(this.defaultuserId, autoserversetting.defaultuserId) &&
        Objects.equals(this.refreshinterval, autoserversetting.refreshinterval) &&
        Objects.equals(this.poolsize, autoserversetting.poolsize) &&
        Objects.equals(this.isactive, autoserversetting.isactive) &&
        Objects.equals(this.site, autoserversetting.site);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, emailaccountId, defaultuserId, refreshinterval, poolsize, isactive, site);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Autoserversetting {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    emailaccountId: ").append(toIndentedString(emailaccountId)).append("\n");
    sb.append("    defaultuserId: ").append(toIndentedString(defaultuserId)).append("\n");
    sb.append("    refreshinterval: ").append(toIndentedString(refreshinterval)).append("\n");
    sb.append("    poolsize: ").append(toIndentedString(poolsize)).append("\n");
    sb.append("    isactive: ").append(toIndentedString(isactive)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
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

