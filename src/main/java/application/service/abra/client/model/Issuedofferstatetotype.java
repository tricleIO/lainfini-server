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
 * Issuedofferstatetotype
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Issuedofferstatetotype   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("issuedofferstate_id")
  private String issuedofferstateId = null;

  @SerializedName("ordernr")
  private Integer ordernr = null;

  @SerializedName("activityprocess_id")
  private String activityprocessId = null;

  @SerializedName("defaultduration")
  private Integer defaultduration = null;

  @SerializedName("defaultrole_id")
  private String defaultroleId = null;

  @SerializedName("defaultuser_id")
  private String defaultuserId = null;

  @SerializedName("isgeneratetoplan")
  private Boolean isgeneratetoplan = null;

  public Issuedofferstatetotype displayname(String displayname) {
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

  public Issuedofferstatetotype id(String id) {
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

  public Issuedofferstatetotype classid(String classid) {
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

  public Issuedofferstatetotype objversion(Integer objversion) {
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

  public Issuedofferstatetotype parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu typ nabídky [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu typ nabídky [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Issuedofferstatetotype issuedofferstateId(String issuedofferstateId) {
    this.issuedofferstateId = issuedofferstateId;
    return this;
  }

   /**
   * stav; id objektu stav nabídky [persistentní položka]
   * @return issuedofferstateId
  **/
  @ApiModelProperty(example = "null", value = "stav; id objektu stav nabídky [persistentní položka]")
  public String getIssuedofferstateId() {
    return issuedofferstateId;
  }

  public void setIssuedofferstateId(String issuedofferstateId) {
    this.issuedofferstateId = issuedofferstateId;
  }

  public Issuedofferstatetotype ordernr(Integer ordernr) {
    this.ordernr = ordernr;
    return this;
  }

   /**
   * pořadové číslo [persistentní položka]
   * @return ordernr
  **/
  @ApiModelProperty(example = "null", value = "pořadové číslo [persistentní položka]")
  public Integer getOrdernr() {
    return ordernr;
  }

  public void setOrdernr(Integer ordernr) {
    this.ordernr = ordernr;
  }

  public Issuedofferstatetotype activityprocessId(String activityprocessId) {
    this.activityprocessId = activityprocessId;
    return this;
  }

   /**
   * proces aktivit
   * @return activityprocessId
  **/
  @ApiModelProperty(example = "null", value = "proces aktivit")
  public String getActivityprocessId() {
    return activityprocessId;
  }

  public void setActivityprocessId(String activityprocessId) {
    this.activityprocessId = activityprocessId;
  }

  public Issuedofferstatetotype defaultduration(Integer defaultduration) {
    this.defaultduration = defaultduration;
    return this;
  }

   /**
   * maximální doba k dokončení [persistentní položka]
   * @return defaultduration
  **/
  @ApiModelProperty(example = "null", value = "maximální doba k dokončení [persistentní položka]")
  public Integer getDefaultduration() {
    return defaultduration;
  }

  public void setDefaultduration(Integer defaultduration) {
    this.defaultduration = defaultduration;
  }

  public Issuedofferstatetotype defaultroleId(String defaultroleId) {
    this.defaultroleId = defaultroleId;
    return this;
  }

   /**
   * výchozí role řešitele; id objektu role [persistentní položka]
   * @return defaultroleId
  **/
  @ApiModelProperty(example = "null", value = "výchozí role řešitele; id objektu role [persistentní položka]")
  public String getDefaultroleId() {
    return defaultroleId;
  }

  public void setDefaultroleId(String defaultroleId) {
    this.defaultroleId = defaultroleId;
  }

  public Issuedofferstatetotype defaultuserId(String defaultuserId) {
    this.defaultuserId = defaultuserId;
    return this;
  }

   /**
   * výchozí řešitel; id objektu uživatel [persistentní položka]
   * @return defaultuserId
  **/
  @ApiModelProperty(example = "null", value = "výchozí řešitel; id objektu uživatel [persistentní položka]")
  public String getDefaultuserId() {
    return defaultuserId;
  }

  public void setDefaultuserId(String defaultuserId) {
    this.defaultuserId = defaultuserId;
  }

  public Issuedofferstatetotype isgeneratetoplan(Boolean isgeneratetoplan) {
    this.isgeneratetoplan = isgeneratetoplan;
    return this;
  }

   /**
   * generovat do plánu [persistentní položka]
   * @return isgeneratetoplan
  **/
  @ApiModelProperty(example = "null", value = "generovat do plánu [persistentní položka]")
  public Boolean getIsgeneratetoplan() {
    return isgeneratetoplan;
  }

  public void setIsgeneratetoplan(Boolean isgeneratetoplan) {
    this.isgeneratetoplan = isgeneratetoplan;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Issuedofferstatetotype issuedofferstatetotype = (Issuedofferstatetotype) o;
    return Objects.equals(this.displayname, issuedofferstatetotype.displayname) &&
        Objects.equals(this.id, issuedofferstatetotype.id) &&
        Objects.equals(this.classid, issuedofferstatetotype.classid) &&
        Objects.equals(this.objversion, issuedofferstatetotype.objversion) &&
        Objects.equals(this.parentId, issuedofferstatetotype.parentId) &&
        Objects.equals(this.issuedofferstateId, issuedofferstatetotype.issuedofferstateId) &&
        Objects.equals(this.ordernr, issuedofferstatetotype.ordernr) &&
        Objects.equals(this.activityprocessId, issuedofferstatetotype.activityprocessId) &&
        Objects.equals(this.defaultduration, issuedofferstatetotype.defaultduration) &&
        Objects.equals(this.defaultroleId, issuedofferstatetotype.defaultroleId) &&
        Objects.equals(this.defaultuserId, issuedofferstatetotype.defaultuserId) &&
        Objects.equals(this.isgeneratetoplan, issuedofferstatetotype.isgeneratetoplan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, issuedofferstateId, ordernr, activityprocessId, defaultduration, defaultroleId, defaultuserId, isgeneratetoplan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Issuedofferstatetotype {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    issuedofferstateId: ").append(toIndentedString(issuedofferstateId)).append("\n");
    sb.append("    ordernr: ").append(toIndentedString(ordernr)).append("\n");
    sb.append("    activityprocessId: ").append(toIndentedString(activityprocessId)).append("\n");
    sb.append("    defaultduration: ").append(toIndentedString(defaultduration)).append("\n");
    sb.append("    defaultroleId: ").append(toIndentedString(defaultroleId)).append("\n");
    sb.append("    defaultuserId: ").append(toIndentedString(defaultuserId)).append("\n");
    sb.append("    isgeneratetoplan: ").append(toIndentedString(isgeneratetoplan)).append("\n");
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
