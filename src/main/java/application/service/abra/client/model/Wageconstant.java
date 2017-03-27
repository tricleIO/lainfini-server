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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Wageconstant
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Wageconstant   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Rows")
  private List<Wageconstantvalue> rows = new ArrayList<Wageconstantvalue>();

  @SerializedName("Hidden")
  private Boolean hidden = null;

  @SerializedName("Code")
  private String code = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("System")
  private Boolean system = null;

  @SerializedName("FieldDataType")
  private Integer fieldDataType = null;

  @SerializedName("EditMethod")
  private Integer editMethod = null;

  @SerializedName("Enumeration")
  private String enumeration = null;

  @SerializedName("FieldDataTypeText")
  private String fieldDataTypeText = null;

  @SerializedName("CodeWithPrefix")
  private String codeWithPrefix = null;

  @SerializedName("Prefix")
  private String prefix = null;

  @SerializedName("AllowChangeHistory")
  private Boolean allowChangeHistory = null;

  @SerializedName("ForWizard")
  private Boolean forWizard = null;

  @SerializedName("IsLocalAmount")
  private Boolean isLocalAmount = null;

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

  public Wageconstant rows(List<Wageconstantvalue> rows) {
    this.rows = rows;
    return this;
  }

  public Wageconstant addRowsItem(Wageconstantvalue rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Hodnoty; kolekce BO Hodnota globální proměnné [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Hodnoty; kolekce BO Hodnota globální proměnné [nepersistentní položka]")
  public List<Wageconstantvalue> getRows() {
    return rows;
  }

  public void setRows(List<Wageconstantvalue> rows) {
    this.rows = rows;
  }

  public Wageconstant hidden(Boolean hidden) {
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

  public Wageconstant code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Kód [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "Kód [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Wageconstant name(String name) {
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

  public Wageconstant system(Boolean system) {
    this.system = system;
    return this;
  }

   /**
   * Orig. [persistentní položka]
   * @return system
  **/
  @ApiModelProperty(example = "null", value = "Orig. [persistentní položka]")
  public Boolean getSystem() {
    return system;
  }

  public void setSystem(Boolean system) {
    this.system = system;
  }

  public Wageconstant fieldDataType(Integer fieldDataType) {
    this.fieldDataType = fieldDataType;
    return this;
  }

   /**
   * Datový typ [persistentní položka]
   * @return fieldDataType
  **/
  @ApiModelProperty(example = "null", value = "Datový typ [persistentní položka]")
  public Integer getFieldDataType() {
    return fieldDataType;
  }

  public void setFieldDataType(Integer fieldDataType) {
    this.fieldDataType = fieldDataType;
  }

  public Wageconstant editMethod(Integer editMethod) {
    this.editMethod = editMethod;
    return this;
  }

   /**
   * Editace [persistentní položka]
   * @return editMethod
  **/
  @ApiModelProperty(example = "null", value = "Editace [persistentní položka]")
  public Integer getEditMethod() {
    return editMethod;
  }

  public void setEditMethod(Integer editMethod) {
    this.editMethod = editMethod;
  }

  public Wageconstant enumeration(String enumeration) {
    this.enumeration = enumeration;
    return this;
  }

   /**
   * Výčet [persistentní položka]
   * @return enumeration
  **/
  @ApiModelProperty(example = "null", value = "Výčet [persistentní položka]")
  public String getEnumeration() {
    return enumeration;
  }

  public void setEnumeration(String enumeration) {
    this.enumeration = enumeration;
  }

  public Wageconstant fieldDataTypeText(String fieldDataTypeText) {
    this.fieldDataTypeText = fieldDataTypeText;
    return this;
  }

   /**
   * Datový typ
   * @return fieldDataTypeText
  **/
  @ApiModelProperty(example = "null", value = "Datový typ")
  public String getFieldDataTypeText() {
    return fieldDataTypeText;
  }

  public void setFieldDataTypeText(String fieldDataTypeText) {
    this.fieldDataTypeText = fieldDataTypeText;
  }

  public Wageconstant codeWithPrefix(String codeWithPrefix) {
    this.codeWithPrefix = codeWithPrefix;
    return this;
  }

   /**
   * Prefix, kód
   * @return codeWithPrefix
  **/
  @ApiModelProperty(example = "null", value = "Prefix, kód")
  public String getCodeWithPrefix() {
    return codeWithPrefix;
  }

  public void setCodeWithPrefix(String codeWithPrefix) {
    this.codeWithPrefix = codeWithPrefix;
  }

  public Wageconstant prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Prefix
   * @return prefix
  **/
  @ApiModelProperty(example = "null", value = "Prefix")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public Wageconstant allowChangeHistory(Boolean allowChangeHistory) {
    this.allowChangeHistory = allowChangeHistory;
    return this;
  }

   /**
   * Lze měnit historii [persistentní položka]
   * @return allowChangeHistory
  **/
  @ApiModelProperty(example = "null", value = "Lze měnit historii [persistentní položka]")
  public Boolean getAllowChangeHistory() {
    return allowChangeHistory;
  }

  public void setAllowChangeHistory(Boolean allowChangeHistory) {
    this.allowChangeHistory = allowChangeHistory;
  }

  public Wageconstant forWizard(Boolean forWizard) {
    this.forWizard = forWizard;
    return this;
  }

   /**
   * Nabízet v průvodci [persistentní položka]
   * @return forWizard
  **/
  @ApiModelProperty(example = "null", value = "Nabízet v průvodci [persistentní položka]")
  public Boolean getForWizard() {
    return forWizard;
  }

  public void setForWizard(Boolean forWizard) {
    this.forWizard = forWizard;
  }

  public Wageconstant isLocalAmount(Boolean isLocalAmount) {
    this.isLocalAmount = isLocalAmount;
    return this;
  }

   /**
   * Je v lokální měně [persistentní položka]
   * @return isLocalAmount
  **/
  @ApiModelProperty(example = "null", value = "Je v lokální měně [persistentní položka]")
  public Boolean getIsLocalAmount() {
    return isLocalAmount;
  }

  public void setIsLocalAmount(Boolean isLocalAmount) {
    this.isLocalAmount = isLocalAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wageconstant wageconstant = (Wageconstant) o;
    return Objects.equals(this.displayName, wageconstant.displayName) &&
        Objects.equals(this.ID, wageconstant.ID) &&
        Objects.equals(this.classID, wageconstant.classID) &&
        Objects.equals(this.objVersion, wageconstant.objVersion) &&
        Objects.equals(this.rows, wageconstant.rows) &&
        Objects.equals(this.hidden, wageconstant.hidden) &&
        Objects.equals(this.code, wageconstant.code) &&
        Objects.equals(this.name, wageconstant.name) &&
        Objects.equals(this.system, wageconstant.system) &&
        Objects.equals(this.fieldDataType, wageconstant.fieldDataType) &&
        Objects.equals(this.editMethod, wageconstant.editMethod) &&
        Objects.equals(this.enumeration, wageconstant.enumeration) &&
        Objects.equals(this.fieldDataTypeText, wageconstant.fieldDataTypeText) &&
        Objects.equals(this.codeWithPrefix, wageconstant.codeWithPrefix) &&
        Objects.equals(this.prefix, wageconstant.prefix) &&
        Objects.equals(this.allowChangeHistory, wageconstant.allowChangeHistory) &&
        Objects.equals(this.forWizard, wageconstant.forWizard) &&
        Objects.equals(this.isLocalAmount, wageconstant.isLocalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, rows, hidden, code, name, system, fieldDataType, editMethod, enumeration, fieldDataTypeText, codeWithPrefix, prefix, allowChangeHistory, forWizard, isLocalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wageconstant {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    fieldDataType: ").append(toIndentedString(fieldDataType)).append("\n");
    sb.append("    editMethod: ").append(toIndentedString(editMethod)).append("\n");
    sb.append("    enumeration: ").append(toIndentedString(enumeration)).append("\n");
    sb.append("    fieldDataTypeText: ").append(toIndentedString(fieldDataTypeText)).append("\n");
    sb.append("    codeWithPrefix: ").append(toIndentedString(codeWithPrefix)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    allowChangeHistory: ").append(toIndentedString(allowChangeHistory)).append("\n");
    sb.append("    forWizard: ").append(toIndentedString(forWizard)).append("\n");
    sb.append("    isLocalAmount: ").append(toIndentedString(isLocalAmount)).append("\n");
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

