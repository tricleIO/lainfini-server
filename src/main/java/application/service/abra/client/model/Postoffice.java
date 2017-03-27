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
 * Postoffice
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Postoffice   {
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

  @SerializedName("PostCode")
  private String postCode = null;

  @SerializedName("PostName")
  private String postName = null;

  @SerializedName("RegionCode")
  private String regionCode = null;

  @SerializedName("RegionName")
  private String regionName = null;

  @SerializedName("District_ID")
  private String districtID = null;

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

  public Postoffice hidden(Boolean hidden) {
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

  public Postoffice postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

   /**
   * PSČ [persistentní položka]
   * @return postCode
  **/
  @ApiModelProperty(example = "null", value = "PSČ [persistentní položka]")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public Postoffice postName(String postName) {
    this.postName = postName;
    return this;
  }

   /**
   * Název pošty [persistentní položka]
   * @return postName
  **/
  @ApiModelProperty(example = "null", value = "Název pošty [persistentní položka]")
  public String getPostName() {
    return postName;
  }

  public void setPostName(String postName) {
    this.postName = postName;
  }

  public Postoffice regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

   /**
   * Okres [persistentní položka]
   * @return regionCode
  **/
  @ApiModelProperty(example = "null", value = "Okres [persistentní položka]")
  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  public Postoffice regionName(String regionName) {
    this.regionName = regionName;
    return this;
  }

   /**
   * Název okresu [persistentní položka]
   * @return regionName
  **/
  @ApiModelProperty(example = "null", value = "Název okresu [persistentní položka]")
  public String getRegionName() {
    return regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  public Postoffice districtID(String districtID) {
    this.districtID = districtID;
    return this;
  }

   /**
   * Okres; ID objektu Okres [persistentní položka]
   * @return districtID
  **/
  @ApiModelProperty(example = "null", value = "Okres; ID objektu Okres [persistentní položka]")
  public String getDistrictID() {
    return districtID;
  }

  public void setDistrictID(String districtID) {
    this.districtID = districtID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Postoffice postoffice = (Postoffice) o;
    return Objects.equals(this.displayName, postoffice.displayName) &&
        Objects.equals(this.ID, postoffice.ID) &&
        Objects.equals(this.classID, postoffice.classID) &&
        Objects.equals(this.objVersion, postoffice.objVersion) &&
        Objects.equals(this.hidden, postoffice.hidden) &&
        Objects.equals(this.postCode, postoffice.postCode) &&
        Objects.equals(this.postName, postoffice.postName) &&
        Objects.equals(this.regionCode, postoffice.regionCode) &&
        Objects.equals(this.regionName, postoffice.regionName) &&
        Objects.equals(this.districtID, postoffice.districtID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, hidden, postCode, postName, regionCode, regionName, districtID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Postoffice {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    postName: ").append(toIndentedString(postName)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    districtID: ").append(toIndentedString(districtID)).append("\n");
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

