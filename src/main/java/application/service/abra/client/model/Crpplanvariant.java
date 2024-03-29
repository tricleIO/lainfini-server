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
import org.joda.time.DateTime;

import java.util.Objects;


/**
 * Crpplanvariant
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Crpplanvariant   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("visibilitykind")
  private Integer visibilitykind = null;

  @SerializedName("ismajor")
  private Boolean ismajor = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("updateddate$date")
  private DateTime updateddatedate = null;

  @SerializedName("saveditemscount")
  private Integer saveditemscount = null;

  public Crpplanvariant displayname(String displayname) {
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

  public Crpplanvariant id(String id) {
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

  public Crpplanvariant classid(String classid) {
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

  public Crpplanvariant objversion(Integer objversion) {
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

  public Crpplanvariant userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * vlastník; id objektu uživatel [persistentní položka]
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu uživatel [persistentní položka]")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Crpplanvariant code(String code) {
    this.code = code;
    return this;
  }

   /**
   * kód [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "kód [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Crpplanvariant name(String name) {
    this.name = name;
    return this;
  }

   /**
   * popis [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "popis [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Crpplanvariant visibilitykind(Integer visibilitykind) {
    this.visibilitykind = visibilitykind;
    return this;
  }

   /**
   * viditelnost [persistentní položka]
   * @return visibilitykind
  **/
  @ApiModelProperty(example = "null", value = "viditelnost [persistentní položka]")
  public Integer getVisibilitykind() {
    return visibilitykind;
  }

  public void setVisibilitykind(Integer visibilitykind) {
    this.visibilitykind = visibilitykind;
  }

  public Crpplanvariant ismajor(Boolean ismajor) {
    this.ismajor = ismajor;
    return this;
  }

   /**
   * hlavní [persistentní položka]
   * @return ismajor
  **/
  @ApiModelProperty(example = "null", value = "hlavní [persistentní položka]")
  public Boolean getIsmajor() {
    return ismajor;
  }

  public void setIsmajor(Boolean ismajor) {
    this.ismajor = ismajor;
  }

  public Crpplanvariant createdbyId(String createdbyId) {
    this.createdbyId = createdbyId;
    return this;
  }

   /**
   * vytvořil; id objektu uživatel [persistentní položka]
   * @return createdbyId
  **/
  @ApiModelProperty(example = "null", value = "vytvořil; id objektu uživatel [persistentní položka]")
  public String getCreatedbyId() {
    return createdbyId;
  }

  public void setCreatedbyId(String createdbyId) {
    this.createdbyId = createdbyId;
  }

  public Crpplanvariant correctedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
    return this;
  }

   /**
   * opravil; id objektu uživatel [persistentní položka]
   * @return correctedbyId
  **/
  @ApiModelProperty(example = "null", value = "opravil; id objektu uživatel [persistentní položka]")
  public String getCorrectedbyId() {
    return correctedbyId;
  }

  public void setCorrectedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
  }

  public Crpplanvariant updateddatedate(DateTime updateddatedate) {
    this.updateddatedate = updateddatedate;
    return this;
  }

   /**
   * datum [persistentní položka]
   * @return updateddatedate
  **/
  @ApiModelProperty(example = "null", value = "datum [persistentní položka]")
  public DateTime getUpdateddatedate() {
    return updateddatedate;
  }

  public void setUpdateddatedate(DateTime updateddatedate) {
    this.updateddatedate = updateddatedate;
  }

  public Crpplanvariant saveditemscount(Integer saveditemscount) {
    this.saveditemscount = saveditemscount;
    return this;
  }

   /**
   * počet [persistentní položka]
   * @return saveditemscount
  **/
  @ApiModelProperty(example = "null", value = "počet [persistentní položka]")
  public Integer getSaveditemscount() {
    return saveditemscount;
  }

  public void setSaveditemscount(Integer saveditemscount) {
    this.saveditemscount = saveditemscount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Crpplanvariant crpplanvariant = (Crpplanvariant) o;
    return Objects.equals(this.displayname, crpplanvariant.displayname) &&
        Objects.equals(this.id, crpplanvariant.id) &&
        Objects.equals(this.classid, crpplanvariant.classid) &&
        Objects.equals(this.objversion, crpplanvariant.objversion) &&
        Objects.equals(this.userId, crpplanvariant.userId) &&
        Objects.equals(this.code, crpplanvariant.code) &&
        Objects.equals(this.name, crpplanvariant.name) &&
        Objects.equals(this.visibilitykind, crpplanvariant.visibilitykind) &&
        Objects.equals(this.ismajor, crpplanvariant.ismajor) &&
        Objects.equals(this.createdbyId, crpplanvariant.createdbyId) &&
        Objects.equals(this.correctedbyId, crpplanvariant.correctedbyId) &&
        Objects.equals(this.updateddatedate, crpplanvariant.updateddatedate) &&
        Objects.equals(this.saveditemscount, crpplanvariant.saveditemscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, userId, code, name, visibilitykind, ismajor, createdbyId, correctedbyId, updateddatedate, saveditemscount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Crpplanvariant {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    visibilitykind: ").append(toIndentedString(visibilitykind)).append("\n");
    sb.append("    ismajor: ").append(toIndentedString(ismajor)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    updateddatedate: ").append(toIndentedString(updateddatedate)).append("\n");
    sb.append("    saveditemscount: ").append(toIndentedString(saveditemscount)).append("\n");
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

