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
 * Crmcampaignvariableinstance
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Crmcampaignvariableinstance   {
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

  @SerializedName("variable_id")
  private String variableId = null;

  @SerializedName("stringvalue")
  private String stringvalue = null;

  public Crmcampaignvariableinstance displayname(String displayname) {
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

  public Crmcampaignvariableinstance id(String id) {
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

  public Crmcampaignvariableinstance classid(String classid) {
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

  public Crmcampaignvariableinstance objversion(Integer objversion) {
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

  public Crmcampaignvariableinstance parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu adresát kampaně [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu adresát kampaně [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Crmcampaignvariableinstance variableId(String variableId) {
    this.variableId = variableId;
    return this;
  }

   /**
   * proměnná; id objektu proměnná kampaně [persistentní položka]
   * @return variableId
  **/
  @ApiModelProperty(example = "null", value = "proměnná; id objektu proměnná kampaně [persistentní položka]")
  public String getVariableId() {
    return variableId;
  }

  public void setVariableId(String variableId) {
    this.variableId = variableId;
  }

  public Crmcampaignvariableinstance stringvalue(String stringvalue) {
    this.stringvalue = stringvalue;
    return this;
  }

   /**
   * hodnota proměnné [persistentní položka]
   * @return stringvalue
  **/
  @ApiModelProperty(example = "null", value = "hodnota proměnné [persistentní položka]")
  public String getStringvalue() {
    return stringvalue;
  }

  public void setStringvalue(String stringvalue) {
    this.stringvalue = stringvalue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Crmcampaignvariableinstance crmcampaignvariableinstance = (Crmcampaignvariableinstance) o;
    return Objects.equals(this.displayname, crmcampaignvariableinstance.displayname) &&
        Objects.equals(this.id, crmcampaignvariableinstance.id) &&
        Objects.equals(this.classid, crmcampaignvariableinstance.classid) &&
        Objects.equals(this.objversion, crmcampaignvariableinstance.objversion) &&
        Objects.equals(this.parentId, crmcampaignvariableinstance.parentId) &&
        Objects.equals(this.variableId, crmcampaignvariableinstance.variableId) &&
        Objects.equals(this.stringvalue, crmcampaignvariableinstance.stringvalue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, variableId, stringvalue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Crmcampaignvariableinstance {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    variableId: ").append(toIndentedString(variableId)).append("\n");
    sb.append("    stringvalue: ").append(toIndentedString(stringvalue)).append("\n");
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

