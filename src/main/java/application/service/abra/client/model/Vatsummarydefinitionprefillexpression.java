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
 * Vatsummarydefinitionprefillexpression
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Vatsummarydefinitionprefillexpression   {
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

  @SerializedName("fieldcode")
  private Integer fieldcode = null;

  @SerializedName("useexpression")
  private Integer useexpression = null;

  @SerializedName("systemexpression")
  private String systemexpression = null;

  @SerializedName("userexpression")
  private String userexpression = null;

  @SerializedName("fieldname")
  private String fieldname = null;

  @SerializedName("prefillkind")
  private Integer prefillkind = null;

  public Vatsummarydefinitionprefillexpression displayname(String displayname) {
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

  public Vatsummarydefinitionprefillexpression id(String id) {
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

  public Vatsummarydefinitionprefillexpression classid(String classid) {
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

  public Vatsummarydefinitionprefillexpression objversion(Integer objversion) {
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

  public Vatsummarydefinitionprefillexpression parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu definice pro dph přiznání [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu definice pro dph přiznání [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Vatsummarydefinitionprefillexpression fieldcode(Integer fieldcode) {
    this.fieldcode = fieldcode;
    return this;
  }

   /**
   * fieldcode [persistentní položka]
   * @return fieldcode
  **/
  @ApiModelProperty(example = "null", value = "fieldcode [persistentní položka]")
  public Integer getFieldcode() {
    return fieldcode;
  }

  public void setFieldcode(Integer fieldcode) {
    this.fieldcode = fieldcode;
  }

  public Vatsummarydefinitionprefillexpression useexpression(Integer useexpression) {
    this.useexpression = useexpression;
    return this;
  }

   /**
   * useexpression [persistentní položka]
   * @return useexpression
  **/
  @ApiModelProperty(example = "null", value = "useexpression [persistentní položka]")
  public Integer getUseexpression() {
    return useexpression;
  }

  public void setUseexpression(Integer useexpression) {
    this.useexpression = useexpression;
  }

  public Vatsummarydefinitionprefillexpression systemexpression(String systemexpression) {
    this.systemexpression = systemexpression;
    return this;
  }

   /**
   * systemexpression [persistentní položka]
   * @return systemexpression
  **/
  @ApiModelProperty(example = "null", value = "systemexpression [persistentní položka]")
  public String getSystemexpression() {
    return systemexpression;
  }

  public void setSystemexpression(String systemexpression) {
    this.systemexpression = systemexpression;
  }

  public Vatsummarydefinitionprefillexpression userexpression(String userexpression) {
    this.userexpression = userexpression;
    return this;
  }

   /**
   * userexpression [persistentní položka]
   * @return userexpression
  **/
  @ApiModelProperty(example = "null", value = "userexpression [persistentní položka]")
  public String getUserexpression() {
    return userexpression;
  }

  public void setUserexpression(String userexpression) {
    this.userexpression = userexpression;
  }

  public Vatsummarydefinitionprefillexpression fieldname(String fieldname) {
    this.fieldname = fieldname;
    return this;
  }

   /**
   * fieldname
   * @return fieldname
  **/
  @ApiModelProperty(example = "null", value = "fieldname")
  public String getFieldname() {
    return fieldname;
  }

  public void setFieldname(String fieldname) {
    this.fieldname = fieldname;
  }

  public Vatsummarydefinitionprefillexpression prefillkind(Integer prefillkind) {
    this.prefillkind = prefillkind;
    return this;
  }

   /**
   * předvyplnit [persistentní položka]
   * @return prefillkind
  **/
  @ApiModelProperty(example = "null", value = "předvyplnit [persistentní položka]")
  public Integer getPrefillkind() {
    return prefillkind;
  }

  public void setPrefillkind(Integer prefillkind) {
    this.prefillkind = prefillkind;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vatsummarydefinitionprefillexpression vatsummarydefinitionprefillexpression = (Vatsummarydefinitionprefillexpression) o;
    return Objects.equals(this.displayname, vatsummarydefinitionprefillexpression.displayname) &&
        Objects.equals(this.id, vatsummarydefinitionprefillexpression.id) &&
        Objects.equals(this.classid, vatsummarydefinitionprefillexpression.classid) &&
        Objects.equals(this.objversion, vatsummarydefinitionprefillexpression.objversion) &&
        Objects.equals(this.parentId, vatsummarydefinitionprefillexpression.parentId) &&
        Objects.equals(this.fieldcode, vatsummarydefinitionprefillexpression.fieldcode) &&
        Objects.equals(this.useexpression, vatsummarydefinitionprefillexpression.useexpression) &&
        Objects.equals(this.systemexpression, vatsummarydefinitionprefillexpression.systemexpression) &&
        Objects.equals(this.userexpression, vatsummarydefinitionprefillexpression.userexpression) &&
        Objects.equals(this.fieldname, vatsummarydefinitionprefillexpression.fieldname) &&
        Objects.equals(this.prefillkind, vatsummarydefinitionprefillexpression.prefillkind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, fieldcode, useexpression, systemexpression, userexpression, fieldname, prefillkind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vatsummarydefinitionprefillexpression {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    fieldcode: ").append(toIndentedString(fieldcode)).append("\n");
    sb.append("    useexpression: ").append(toIndentedString(useexpression)).append("\n");
    sb.append("    systemexpression: ").append(toIndentedString(systemexpression)).append("\n");
    sb.append("    userexpression: ").append(toIndentedString(userexpression)).append("\n");
    sb.append("    fieldname: ").append(toIndentedString(fieldname)).append("\n");
    sb.append("    prefillkind: ").append(toIndentedString(prefillkind)).append("\n");
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

