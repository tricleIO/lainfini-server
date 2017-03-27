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
import org.joda.time.DateTime;

import java.util.Objects;


/**
 * Wageoperationimport
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Wageoperationimport   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("ExternalCreator")
  private String externalCreator = null;

  @SerializedName("InformationalText")
  private String informationalText = null;

  @SerializedName("ImportDate$DATE")
  private DateTime importDateDATE = null;

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

  public Wageoperationimport externalCreator(String externalCreator) {
    this.externalCreator = externalCreator;
    return this;
  }

   /**
   * Zdroj importu [persistentní položka]
   * @return externalCreator
  **/
  @ApiModelProperty(example = "null", value = "Zdroj importu [persistentní položka]")
  public String getExternalCreator() {
    return externalCreator;
  }

  public void setExternalCreator(String externalCreator) {
    this.externalCreator = externalCreator;
  }

  public Wageoperationimport informationalText(String informationalText) {
    this.informationalText = informationalText;
    return this;
  }

   /**
   * Informace [persistentní položka]
   * @return informationalText
  **/
  @ApiModelProperty(example = "null", value = "Informace [persistentní položka]")
  public String getInformationalText() {
    return informationalText;
  }

  public void setInformationalText(String informationalText) {
    this.informationalText = informationalText;
  }

  public Wageoperationimport importDateDATE(DateTime importDateDATE) {
    this.importDateDATE = importDateDATE;
    return this;
  }

   /**
   * Datum importu [persistentní položka]
   * @return importDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum importu [persistentní položka]")
  public DateTime getImportDateDATE() {
    return importDateDATE;
  }

  public void setImportDateDATE(DateTime importDateDATE) {
    this.importDateDATE = importDateDATE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wageoperationimport wageoperationimport = (Wageoperationimport) o;
    return Objects.equals(this.displayName, wageoperationimport.displayName) &&
        Objects.equals(this.ID, wageoperationimport.ID) &&
        Objects.equals(this.classID, wageoperationimport.classID) &&
        Objects.equals(this.objVersion, wageoperationimport.objVersion) &&
        Objects.equals(this.externalCreator, wageoperationimport.externalCreator) &&
        Objects.equals(this.informationalText, wageoperationimport.informationalText) &&
        Objects.equals(this.importDateDATE, wageoperationimport.importDateDATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, externalCreator, informationalText, importDateDATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wageoperationimport {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    externalCreator: ").append(toIndentedString(externalCreator)).append("\n");
    sb.append("    informationalText: ").append(toIndentedString(informationalText)).append("\n");
    sb.append("    importDateDATE: ").append(toIndentedString(importDateDATE)).append("\n");
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

