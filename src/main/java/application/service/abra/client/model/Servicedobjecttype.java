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
 * Servicedobjecttype
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Servicedobjecttype   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Hidden")
  private Boolean hidden = null;

  @SerializedName("Parent_ID")
  private String parentID = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ServiceType_ID")
  private String serviceTypeID = null;

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

  public Servicedobjecttype hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Skrytý [persistentní položka]
   * @return hidden
  **/
  @ApiModelProperty(example = "null", value = "Skrytý [persistentní položka]")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public Servicedobjecttype parentID(String parentID) {
    this.parentID = parentID;
    return this;
  }

   /**
   * Nadřízený model; ID objektu Model servisovaného předmětu [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Nadřízený model; ID objektu Model servisovaného předmětu [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public void setParentID(String parentID) {
    this.parentID = parentID;
  }

  public Servicedobjecttype name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Model [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Model [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Servicedobjecttype serviceTypeID(String serviceTypeID) {
    this.serviceTypeID = serviceTypeID;
    return this;
  }

   /**
   * Typ servisního případu; ID objektu Typ servisního případu [persistentní položka]
   * @return serviceTypeID
  **/
  @ApiModelProperty(example = "null", value = "Typ servisního případu; ID objektu Typ servisního případu [persistentní položka]")
  public String getServiceTypeID() {
    return serviceTypeID;
  }

  public void setServiceTypeID(String serviceTypeID) {
    this.serviceTypeID = serviceTypeID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Servicedobjecttype servicedobjecttype = (Servicedobjecttype) o;
    return Objects.equals(this.displayName, servicedobjecttype.displayName) &&
        Objects.equals(this.ID, servicedobjecttype.ID) &&
        Objects.equals(this.classID, servicedobjecttype.classID) &&
        Objects.equals(this.objVersion, servicedobjecttype.objVersion) &&
        Objects.equals(this.hidden, servicedobjecttype.hidden) &&
        Objects.equals(this.parentID, servicedobjecttype.parentID) &&
        Objects.equals(this.name, servicedobjecttype.name) &&
        Objects.equals(this.serviceTypeID, servicedobjecttype.serviceTypeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, hidden, parentID, name, serviceTypeID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Servicedobjecttype {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceTypeID: ").append(toIndentedString(serviceTypeID)).append("\n");
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

