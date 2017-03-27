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
 * Wlwagetransferdef
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Wlwagetransferdef   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DefType")
  private Integer defType = null;

  @SerializedName("EntryType_ID")
  private String entryTypeID = null;

  @SerializedName("TransferType")
  private Integer transferType = null;

  @SerializedName("AggregationType")
  private Integer aggregationType = null;

  @SerializedName("FieldCode")
  private Integer fieldCode = null;

  @SerializedName("CorrectionExpression")
  private String correctionExpression = null;

  @SerializedName("WageOperTypeIDExpr")
  private String wageOperTypeIDExpr = null;

  @SerializedName("AbsenceTypeIDExpr")
  private String absenceTypeIDExpr = null;

  @SerializedName("SickBenefitTypeIDExpr")
  private String sickBenefitTypeIDExpr = null;

  @SerializedName("ScriptPackage_ID")
  private String scriptPackageID = null;

  @SerializedName("ScriptLibrary")
  private String scriptLibrary = null;

  @SerializedName("ScriptFunction")
  private String scriptFunction = null;

  @SerializedName("DocQueue_ID")
  private String docQueueID = null;

  @SerializedName("DisabledForClosing")
  private Boolean disabledForClosing = null;

  @SerializedName("ClosingValueType")
  private Integer closingValueType = null;

  @SerializedName("FieldCodeLabel")
  private String fieldCodeLabel = null;

  @SerializedName("FieldCodeName")
  private String fieldCodeName = null;

  @SerializedName("DefTypeAsText")
  private String defTypeAsText = null;

  @SerializedName("AggregationTypeAsText")
  private String aggregationTypeAsText = null;

  @SerializedName("TransferTypeAsText")
  private String transferTypeAsText = null;

  @SerializedName("ScriptPackageName")
  private String scriptPackageName = null;

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

  public Wlwagetransferdef description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Popis [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Popis [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Wlwagetransferdef defType(Integer defType) {
    this.defType = defType;
    return this;
  }

   /**
   * Typ záznamu [persistentní položka]
   * @return defType
  **/
  @ApiModelProperty(example = "null", value = "Typ záznamu [persistentní položka]")
  public Integer getDefType() {
    return defType;
  }

  public void setDefType(Integer defType) {
    this.defType = defType;
  }

  public Wlwagetransferdef entryTypeID(String entryTypeID) {
    this.entryTypeID = entryTypeID;
    return this;
  }

   /**
   * Základní typ; ID objektu Docházka - Druh činnosti [persistentní položka]
   * @return entryTypeID
  **/
  @ApiModelProperty(example = "null", value = "Základní typ; ID objektu Docházka - Druh činnosti [persistentní položka]")
  public String getEntryTypeID() {
    return entryTypeID;
  }

  public void setEntryTypeID(String entryTypeID) {
    this.entryTypeID = entryTypeID;
  }

  public Wlwagetransferdef transferType(Integer transferType) {
    this.transferType = transferType;
    return this;
  }

   /**
   * Způsob přenosu [persistentní položka]
   * @return transferType
  **/
  @ApiModelProperty(example = "null", value = "Způsob přenosu [persistentní položka]")
  public Integer getTransferType() {
    return transferType;
  }

  public void setTransferType(Integer transferType) {
    this.transferType = transferType;
  }

  public Wlwagetransferdef aggregationType(Integer aggregationType) {
    this.aggregationType = aggregationType;
    return this;
  }

   /**
   * Způsob agregace [persistentní položka]
   * @return aggregationType
  **/
  @ApiModelProperty(example = "null", value = "Způsob agregace [persistentní položka]")
  public Integer getAggregationType() {
    return aggregationType;
  }

  public void setAggregationType(Integer aggregationType) {
    this.aggregationType = aggregationType;
  }

  public Wlwagetransferdef fieldCode(Integer fieldCode) {
    this.fieldCode = fieldCode;
    return this;
  }

   /**
   * FieldCode cílové položky [persistentní položka]
   * @return fieldCode
  **/
  @ApiModelProperty(example = "null", value = "FieldCode cílové položky [persistentní položka]")
  public Integer getFieldCode() {
    return fieldCode;
  }

  public void setFieldCode(Integer fieldCode) {
    this.fieldCode = fieldCode;
  }

  public Wlwagetransferdef correctionExpression(String correctionExpression) {
    this.correctionExpression = correctionExpression;
    return this;
  }

   /**
   * Výraz korekce [persistentní položka]
   * @return correctionExpression
  **/
  @ApiModelProperty(example = "null", value = "Výraz korekce [persistentní položka]")
  public String getCorrectionExpression() {
    return correctionExpression;
  }

  public void setCorrectionExpression(String correctionExpression) {
    this.correctionExpression = correctionExpression;
  }

  public Wlwagetransferdef wageOperTypeIDExpr(String wageOperTypeIDExpr) {
    this.wageOperTypeIDExpr = wageOperTypeIDExpr;
    return this;
  }

   /**
   * Výraz pro zjištění ID z Druhu výkonu [persistentní položka]
   * @return wageOperTypeIDExpr
  **/
  @ApiModelProperty(example = "null", value = "Výraz pro zjištění ID z Druhu výkonu [persistentní položka]")
  public String getWageOperTypeIDExpr() {
    return wageOperTypeIDExpr;
  }

  public void setWageOperTypeIDExpr(String wageOperTypeIDExpr) {
    this.wageOperTypeIDExpr = wageOperTypeIDExpr;
  }

  public Wlwagetransferdef absenceTypeIDExpr(String absenceTypeIDExpr) {
    this.absenceTypeIDExpr = absenceTypeIDExpr;
    return this;
  }

   /**
   * Výraz pro zjištění ID z Druhu srážek [persistentní položka]
   * @return absenceTypeIDExpr
  **/
  @ApiModelProperty(example = "null", value = "Výraz pro zjištění ID z Druhu srážek [persistentní položka]")
  public String getAbsenceTypeIDExpr() {
    return absenceTypeIDExpr;
  }

  public void setAbsenceTypeIDExpr(String absenceTypeIDExpr) {
    this.absenceTypeIDExpr = absenceTypeIDExpr;
  }

  public Wlwagetransferdef sickBenefitTypeIDExpr(String sickBenefitTypeIDExpr) {
    this.sickBenefitTypeIDExpr = sickBenefitTypeIDExpr;
    return this;
  }

   /**
   * Výraz pro zjištění ID z Druhu nem. dávky [persistentní položka]
   * @return sickBenefitTypeIDExpr
  **/
  @ApiModelProperty(example = "null", value = "Výraz pro zjištění ID z Druhu nem. dávky [persistentní položka]")
  public String getSickBenefitTypeIDExpr() {
    return sickBenefitTypeIDExpr;
  }

  public void setSickBenefitTypeIDExpr(String sickBenefitTypeIDExpr) {
    this.sickBenefitTypeIDExpr = sickBenefitTypeIDExpr;
  }

  public Wlwagetransferdef scriptPackageID(String scriptPackageID) {
    this.scriptPackageID = scriptPackageID;
    return this;
  }

   /**
   * Balíček skriptů [persistentní položka]
   * @return scriptPackageID
  **/
  @ApiModelProperty(example = "null", value = "Balíček skriptů [persistentní položka]")
  public String getScriptPackageID() {
    return scriptPackageID;
  }

  public void setScriptPackageID(String scriptPackageID) {
    this.scriptPackageID = scriptPackageID;
  }

  public Wlwagetransferdef scriptLibrary(String scriptLibrary) {
    this.scriptLibrary = scriptLibrary;
    return this;
  }

   /**
   * Knihovna skriptů [persistentní položka]
   * @return scriptLibrary
  **/
  @ApiModelProperty(example = "null", value = "Knihovna skriptů [persistentní položka]")
  public String getScriptLibrary() {
    return scriptLibrary;
  }

  public void setScriptLibrary(String scriptLibrary) {
    this.scriptLibrary = scriptLibrary;
  }

  public Wlwagetransferdef scriptFunction(String scriptFunction) {
    this.scriptFunction = scriptFunction;
    return this;
  }

   /**
   * Funkce [persistentní položka]
   * @return scriptFunction
  **/
  @ApiModelProperty(example = "null", value = "Funkce [persistentní položka]")
  public String getScriptFunction() {
    return scriptFunction;
  }

  public void setScriptFunction(String scriptFunction) {
    this.scriptFunction = scriptFunction;
  }

  public Wlwagetransferdef docQueueID(String docQueueID) {
    this.docQueueID = docQueueID;
    return this;
  }

   /**
   * Řada dokladů; ID objektu Řada dokladů [persistentní položka]
   * @return docQueueID
  **/
  @ApiModelProperty(example = "null", value = "Řada dokladů; ID objektu Řada dokladů [persistentní položka]")
  public String getDocQueueID() {
    return docQueueID;
  }

  public void setDocQueueID(String docQueueID) {
    this.docQueueID = docQueueID;
  }

  public Wlwagetransferdef disabledForClosing(Boolean disabledForClosing) {
    this.disabledForClosing = disabledForClosing;
    return this;
  }

   /**
   * Neaktivní [persistentní položka]
   * @return disabledForClosing
  **/
  @ApiModelProperty(example = "null", value = "Neaktivní [persistentní položka]")
  public Boolean getDisabledForClosing() {
    return disabledForClosing;
  }

  public void setDisabledForClosing(Boolean disabledForClosing) {
    this.disabledForClosing = disabledForClosing;
  }

  public Wlwagetransferdef closingValueType(Integer closingValueType) {
    this.closingValueType = closingValueType;
    return this;
  }

   /**
   * Typ počítané položky [persistentní položka]
   * @return closingValueType
  **/
  @ApiModelProperty(example = "null", value = "Typ počítané položky [persistentní položka]")
  public Integer getClosingValueType() {
    return closingValueType;
  }

  public void setClosingValueType(Integer closingValueType) {
    this.closingValueType = closingValueType;
  }

  public Wlwagetransferdef fieldCodeLabel(String fieldCodeLabel) {
    this.fieldCodeLabel = fieldCodeLabel;
    return this;
  }

   /**
   * FieldCode cílové položky
   * @return fieldCodeLabel
  **/
  @ApiModelProperty(example = "null", value = "FieldCode cílové položky")
  public String getFieldCodeLabel() {
    return fieldCodeLabel;
  }

  public void setFieldCodeLabel(String fieldCodeLabel) {
    this.fieldCodeLabel = fieldCodeLabel;
  }

  public Wlwagetransferdef fieldCodeName(String fieldCodeName) {
    this.fieldCodeName = fieldCodeName;
    return this;
  }

   /**
   * FieldCode cílové položky
   * @return fieldCodeName
  **/
  @ApiModelProperty(example = "null", value = "FieldCode cílové položky")
  public String getFieldCodeName() {
    return fieldCodeName;
  }

  public void setFieldCodeName(String fieldCodeName) {
    this.fieldCodeName = fieldCodeName;
  }

  public Wlwagetransferdef defTypeAsText(String defTypeAsText) {
    this.defTypeAsText = defTypeAsText;
    return this;
  }

   /**
   * Typ záznamu
   * @return defTypeAsText
  **/
  @ApiModelProperty(example = "null", value = "Typ záznamu")
  public String getDefTypeAsText() {
    return defTypeAsText;
  }

  public void setDefTypeAsText(String defTypeAsText) {
    this.defTypeAsText = defTypeAsText;
  }

  public Wlwagetransferdef aggregationTypeAsText(String aggregationTypeAsText) {
    this.aggregationTypeAsText = aggregationTypeAsText;
    return this;
  }

   /**
   * Způsob agregace
   * @return aggregationTypeAsText
  **/
  @ApiModelProperty(example = "null", value = "Způsob agregace")
  public String getAggregationTypeAsText() {
    return aggregationTypeAsText;
  }

  public void setAggregationTypeAsText(String aggregationTypeAsText) {
    this.aggregationTypeAsText = aggregationTypeAsText;
  }

  public Wlwagetransferdef transferTypeAsText(String transferTypeAsText) {
    this.transferTypeAsText = transferTypeAsText;
    return this;
  }

   /**
   * Způsob přenosu
   * @return transferTypeAsText
  **/
  @ApiModelProperty(example = "null", value = "Způsob přenosu")
  public String getTransferTypeAsText() {
    return transferTypeAsText;
  }

  public void setTransferTypeAsText(String transferTypeAsText) {
    this.transferTypeAsText = transferTypeAsText;
  }

   /**
   * Název balíčku skriptů
   * @return scriptPackageName
  **/
  @ApiModelProperty(example = "null", value = "Název balíčku skriptů")
  public String getScriptPackageName() {
    return scriptPackageName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wlwagetransferdef wlwagetransferdef = (Wlwagetransferdef) o;
    return Objects.equals(this.displayName, wlwagetransferdef.displayName) &&
        Objects.equals(this.ID, wlwagetransferdef.ID) &&
        Objects.equals(this.classID, wlwagetransferdef.classID) &&
        Objects.equals(this.objVersion, wlwagetransferdef.objVersion) &&
        Objects.equals(this.description, wlwagetransferdef.description) &&
        Objects.equals(this.defType, wlwagetransferdef.defType) &&
        Objects.equals(this.entryTypeID, wlwagetransferdef.entryTypeID) &&
        Objects.equals(this.transferType, wlwagetransferdef.transferType) &&
        Objects.equals(this.aggregationType, wlwagetransferdef.aggregationType) &&
        Objects.equals(this.fieldCode, wlwagetransferdef.fieldCode) &&
        Objects.equals(this.correctionExpression, wlwagetransferdef.correctionExpression) &&
        Objects.equals(this.wageOperTypeIDExpr, wlwagetransferdef.wageOperTypeIDExpr) &&
        Objects.equals(this.absenceTypeIDExpr, wlwagetransferdef.absenceTypeIDExpr) &&
        Objects.equals(this.sickBenefitTypeIDExpr, wlwagetransferdef.sickBenefitTypeIDExpr) &&
        Objects.equals(this.scriptPackageID, wlwagetransferdef.scriptPackageID) &&
        Objects.equals(this.scriptLibrary, wlwagetransferdef.scriptLibrary) &&
        Objects.equals(this.scriptFunction, wlwagetransferdef.scriptFunction) &&
        Objects.equals(this.docQueueID, wlwagetransferdef.docQueueID) &&
        Objects.equals(this.disabledForClosing, wlwagetransferdef.disabledForClosing) &&
        Objects.equals(this.closingValueType, wlwagetransferdef.closingValueType) &&
        Objects.equals(this.fieldCodeLabel, wlwagetransferdef.fieldCodeLabel) &&
        Objects.equals(this.fieldCodeName, wlwagetransferdef.fieldCodeName) &&
        Objects.equals(this.defTypeAsText, wlwagetransferdef.defTypeAsText) &&
        Objects.equals(this.aggregationTypeAsText, wlwagetransferdef.aggregationTypeAsText) &&
        Objects.equals(this.transferTypeAsText, wlwagetransferdef.transferTypeAsText) &&
        Objects.equals(this.scriptPackageName, wlwagetransferdef.scriptPackageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, description, defType, entryTypeID, transferType, aggregationType, fieldCode, correctionExpression, wageOperTypeIDExpr, absenceTypeIDExpr, sickBenefitTypeIDExpr, scriptPackageID, scriptLibrary, scriptFunction, docQueueID, disabledForClosing, closingValueType, fieldCodeLabel, fieldCodeName, defTypeAsText, aggregationTypeAsText, transferTypeAsText, scriptPackageName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wlwagetransferdef {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defType: ").append(toIndentedString(defType)).append("\n");
    sb.append("    entryTypeID: ").append(toIndentedString(entryTypeID)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    aggregationType: ").append(toIndentedString(aggregationType)).append("\n");
    sb.append("    fieldCode: ").append(toIndentedString(fieldCode)).append("\n");
    sb.append("    correctionExpression: ").append(toIndentedString(correctionExpression)).append("\n");
    sb.append("    wageOperTypeIDExpr: ").append(toIndentedString(wageOperTypeIDExpr)).append("\n");
    sb.append("    absenceTypeIDExpr: ").append(toIndentedString(absenceTypeIDExpr)).append("\n");
    sb.append("    sickBenefitTypeIDExpr: ").append(toIndentedString(sickBenefitTypeIDExpr)).append("\n");
    sb.append("    scriptPackageID: ").append(toIndentedString(scriptPackageID)).append("\n");
    sb.append("    scriptLibrary: ").append(toIndentedString(scriptLibrary)).append("\n");
    sb.append("    scriptFunction: ").append(toIndentedString(scriptFunction)).append("\n");
    sb.append("    docQueueID: ").append(toIndentedString(docQueueID)).append("\n");
    sb.append("    disabledForClosing: ").append(toIndentedString(disabledForClosing)).append("\n");
    sb.append("    closingValueType: ").append(toIndentedString(closingValueType)).append("\n");
    sb.append("    fieldCodeLabel: ").append(toIndentedString(fieldCodeLabel)).append("\n");
    sb.append("    fieldCodeName: ").append(toIndentedString(fieldCodeName)).append("\n");
    sb.append("    defTypeAsText: ").append(toIndentedString(defTypeAsText)).append("\n");
    sb.append("    aggregationTypeAsText: ").append(toIndentedString(aggregationTypeAsText)).append("\n");
    sb.append("    transferTypeAsText: ").append(toIndentedString(transferTypeAsText)).append("\n");
    sb.append("    scriptPackageName: ").append(toIndentedString(scriptPackageName)).append("\n");
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

