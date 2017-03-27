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
 * Storecardmenuitemlink
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Storecardmenuitemlink   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("StoreCard_ID")
  private String storeCardID = null;

  @SerializedName("StoreMenuItem_ID")
  private String storeMenuItemID = null;

  @SerializedName("IsBasicLink")
  private Boolean isBasicLink = null;

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

  public Storecardmenuitemlink storeCardID(String storeCardID) {
    this.storeCardID = storeCardID;
    return this;
  }

   /**
   * Skladová karta; ID objektu Skladová karta [persistentní položka]
   * @return storeCardID
  **/
  @ApiModelProperty(example = "null", value = "Skladová karta; ID objektu Skladová karta [persistentní položka]")
  public String getStoreCardID() {
    return storeCardID;
  }

  public void setStoreCardID(String storeCardID) {
    this.storeCardID = storeCardID;
  }

  public Storecardmenuitemlink storeMenuItemID(String storeMenuItemID) {
    this.storeMenuItemID = storeMenuItemID;
    return this;
  }

   /**
   * Skladové menu; ID objektu Skladové menu [persistentní položka]
   * @return storeMenuItemID
  **/
  @ApiModelProperty(example = "null", value = "Skladové menu; ID objektu Skladové menu [persistentní položka]")
  public String getStoreMenuItemID() {
    return storeMenuItemID;
  }

  public void setStoreMenuItemID(String storeMenuItemID) {
    this.storeMenuItemID = storeMenuItemID;
  }

  public Storecardmenuitemlink isBasicLink(Boolean isBasicLink) {
    this.isBasicLink = isBasicLink;
    return this;
  }

   /**
   * Výchozí
   * @return isBasicLink
  **/
  @ApiModelProperty(example = "null", value = "Výchozí")
  public Boolean getIsBasicLink() {
    return isBasicLink;
  }

  public void setIsBasicLink(Boolean isBasicLink) {
    this.isBasicLink = isBasicLink;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Storecardmenuitemlink storecardmenuitemlink = (Storecardmenuitemlink) o;
    return Objects.equals(this.displayName, storecardmenuitemlink.displayName) &&
        Objects.equals(this.ID, storecardmenuitemlink.ID) &&
        Objects.equals(this.classID, storecardmenuitemlink.classID) &&
        Objects.equals(this.objVersion, storecardmenuitemlink.objVersion) &&
        Objects.equals(this.storeCardID, storecardmenuitemlink.storeCardID) &&
        Objects.equals(this.storeMenuItemID, storecardmenuitemlink.storeMenuItemID) &&
        Objects.equals(this.isBasicLink, storecardmenuitemlink.isBasicLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, storeCardID, storeMenuItemID, isBasicLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Storecardmenuitemlink {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    storeCardID: ").append(toIndentedString(storeCardID)).append("\n");
    sb.append("    storeMenuItemID: ").append(toIndentedString(storeMenuItemID)).append("\n");
    sb.append("    isBasicLink: ").append(toIndentedString(isBasicLink)).append("\n");
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

