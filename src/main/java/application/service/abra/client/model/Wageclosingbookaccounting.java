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
 * Wageclosingbookaccounting
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Wageclosingbookaccounting   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("ClosingDefinition_ID")
  private String closingDefinitionID = null;

  @SerializedName("AccPresetDef_ID")
  private String accPresetDefID = null;

  @SerializedName("WageList_ID")
  private String wageListID = null;

  @SerializedName("WageOperation_ID")
  private String wageOperationID = null;

  @SerializedName("Dock_ID")
  private String dockID = null;

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

  public Wageclosingbookaccounting closingDefinitionID(String closingDefinitionID) {
    this.closingDefinitionID = closingDefinitionID;
    return this;
  }

   /**
   * Definice zaúčtování; ID objektu Definice výpočtu uzávěrky [persistentní položka]
   * @return closingDefinitionID
  **/
  @ApiModelProperty(example = "null", value = "Definice zaúčtování; ID objektu Definice výpočtu uzávěrky [persistentní položka]")
  public String getClosingDefinitionID() {
    return closingDefinitionID;
  }

  public void setClosingDefinitionID(String closingDefinitionID) {
    this.closingDefinitionID = closingDefinitionID;
  }

  public Wageclosingbookaccounting accPresetDefID(String accPresetDefID) {
    this.accPresetDefID = accPresetDefID;
    return this;
  }

   /**
   * Předkontace; ID objektu Účetní předkontace [persistentní položka]
   * @return accPresetDefID
  **/
  @ApiModelProperty(example = "null", value = "Předkontace; ID objektu Účetní předkontace [persistentní položka]")
  public String getAccPresetDefID() {
    return accPresetDefID;
  }

  public void setAccPresetDefID(String accPresetDefID) {
    this.accPresetDefID = accPresetDefID;
  }

  public Wageclosingbookaccounting wageListID(String wageListID) {
    this.wageListID = wageListID;
    return this;
  }

   /**
   * Mzdový list; ID objektu Mzdový list dílčí [persistentní položka]
   * @return wageListID
  **/
  @ApiModelProperty(example = "null", value = "Mzdový list; ID objektu Mzdový list dílčí [persistentní položka]")
  public String getWageListID() {
    return wageListID;
  }

  public void setWageListID(String wageListID) {
    this.wageListID = wageListID;
  }

  public Wageclosingbookaccounting wageOperationID(String wageOperationID) {
    this.wageOperationID = wageOperationID;
    return this;
  }

   /**
   * Druh výkonu; ID objektu Výkon [persistentní položka]
   * @return wageOperationID
  **/
  @ApiModelProperty(example = "null", value = "Druh výkonu; ID objektu Výkon [persistentní položka]")
  public String getWageOperationID() {
    return wageOperationID;
  }

  public void setWageOperationID(String wageOperationID) {
    this.wageOperationID = wageOperationID;
  }

  public Wageclosingbookaccounting dockID(String dockID) {
    this.dockID = dockID;
    return this;
  }

   /**
   * Srážka; ID objektu Srážka [persistentní položka]
   * @return dockID
  **/
  @ApiModelProperty(example = "null", value = "Srážka; ID objektu Srážka [persistentní položka]")
  public String getDockID() {
    return dockID;
  }

  public void setDockID(String dockID) {
    this.dockID = dockID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wageclosingbookaccounting wageclosingbookaccounting = (Wageclosingbookaccounting) o;
    return Objects.equals(this.displayName, wageclosingbookaccounting.displayName) &&
        Objects.equals(this.ID, wageclosingbookaccounting.ID) &&
        Objects.equals(this.classID, wageclosingbookaccounting.classID) &&
        Objects.equals(this.objVersion, wageclosingbookaccounting.objVersion) &&
        Objects.equals(this.closingDefinitionID, wageclosingbookaccounting.closingDefinitionID) &&
        Objects.equals(this.accPresetDefID, wageclosingbookaccounting.accPresetDefID) &&
        Objects.equals(this.wageListID, wageclosingbookaccounting.wageListID) &&
        Objects.equals(this.wageOperationID, wageclosingbookaccounting.wageOperationID) &&
        Objects.equals(this.dockID, wageclosingbookaccounting.dockID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, closingDefinitionID, accPresetDefID, wageListID, wageOperationID, dockID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wageclosingbookaccounting {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    closingDefinitionID: ").append(toIndentedString(closingDefinitionID)).append("\n");
    sb.append("    accPresetDefID: ").append(toIndentedString(accPresetDefID)).append("\n");
    sb.append("    wageListID: ").append(toIndentedString(wageListID)).append("\n");
    sb.append("    wageOperationID: ").append(toIndentedString(wageOperationID)).append("\n");
    sb.append("    dockID: ").append(toIndentedString(dockID)).append("\n");
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

