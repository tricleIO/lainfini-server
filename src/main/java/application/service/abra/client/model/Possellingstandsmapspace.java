/**
 * ABRA Gen Web API (spojení testapi)
 * Webové API systému 17.03.03
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
 * Possellingstandsmapspace
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Possellingstandsmapspace   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Parent_ID")
  private String parentID = null;

  @SerializedName("PosIndex")
  private Integer posIndex = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Picture_ID")
  private Possellingstandsmapspace pictureID = null;

   /**
   * Název
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "Název")
  public String getDisplayName() {
    return displayName;
  }

   /**
   * Vlastní ID [persistentní položka]
   * @return ID
  **/
  @ApiModelProperty(example = "null", value = "Vlastní ID [persistentní položka]")
  public String getID() {
    return ID;
  }

   /**
   * ID třídy
   * @return classID
  **/
  @ApiModelProperty(example = "null", value = "ID třídy")
  public String getClassID() {
    return classID;
  }

   /**
   * Verze objektu [persistentní položka]
   * @return objVersion
  **/
  @ApiModelProperty(example = "null", value = "Verze objektu [persistentní položka]")
  public Integer getObjVersion() {
    return objVersion;
  }

   /**
   * Vlastník; ID objektu Mapa prodejních míst [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Mapa prodejních míst [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Possellingstandsmapspace posIndex(Integer posIndex) {
    this.posIndex = posIndex;
    return this;
  }

   /**
   * Pořadí [persistentní položka]
   * @return posIndex
  **/
  @ApiModelProperty(example = "null", value = "Pořadí [persistentní položka]")
  public Integer getPosIndex() {
    return posIndex;
  }

  public void setPosIndex(Integer posIndex) {
    this.posIndex = posIndex;
  }

  public Possellingstandsmapspace name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Název [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Název [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Possellingstandsmapspace pictureID(Possellingstandsmapspace pictureID) {
    this.pictureID = pictureID;
    return this;
  }

   /**
   * Get pictureID
   * @return pictureID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Possellingstandsmapspace getPictureID() {
    return pictureID;
  }

  public void setPictureID(Possellingstandsmapspace pictureID) {
    this.pictureID = pictureID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Possellingstandsmapspace possellingstandsmapspace = (Possellingstandsmapspace) o;
    return Objects.equals(this.displayName, possellingstandsmapspace.displayName) &&
        Objects.equals(this.ID, possellingstandsmapspace.ID) &&
        Objects.equals(this.classID, possellingstandsmapspace.classID) &&
        Objects.equals(this.objVersion, possellingstandsmapspace.objVersion) &&
        Objects.equals(this.parentID, possellingstandsmapspace.parentID) &&
        Objects.equals(this.posIndex, possellingstandsmapspace.posIndex) &&
        Objects.equals(this.name, possellingstandsmapspace.name) &&
        Objects.equals(this.pictureID, possellingstandsmapspace.pictureID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, posIndex, name, pictureID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Possellingstandsmapspace {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    posIndex: ").append(toIndentedString(posIndex)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pictureID: ").append(toIndentedString(pictureID)).append("\n");
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

