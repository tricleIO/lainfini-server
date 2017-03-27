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
 * Plmpqparam
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Plmpqparam   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("DocQueue_ID")
  private String docQueueID = null;

  @SerializedName("AuthorizationRequired")
  private Integer authorizationRequired = null;

  @SerializedName("DocQueueForJO_ID")
  private String docQueueForJOID = null;

  @SerializedName("TariffForJO_ID")
  private String tariffForJOID = null;

  @SerializedName("EditNorm")
  private Boolean editNorm = null;

  @SerializedName("DefaultManEntRtn_ID")
  private String defaultManEntRtnID = null;

  @SerializedName("NoShowDialog")
  private Boolean noShowDialog = null;

  @SerializedName("MethodOfSalaryCalculation")
  private Integer methodOfSalaryCalculation = null;

  @SerializedName("MethodOfSalaryClass")
  private Integer methodOfSalaryClass = null;

  @SerializedName("DefaultSettingOfMIX")
  private Boolean defaultSettingOfMIX = null;

  @SerializedName("DefaultSupposedStore_ID")
  private String defaultSupposedStoreID = null;

  @SerializedName("InPlan")
  private Boolean inPlan = null;

  @SerializedName("Firm_ID")
  private String firmID = null;

  @SerializedName("ChoosingRoutine")
  private Integer choosingRoutine = null;

  @SerializedName("ChoosingPL")
  private Integer choosingPL = null;

  @SerializedName("DefaultCanceled")
  private Boolean defaultCanceled = null;

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

  public Plmpqparam docQueueID(String docQueueID) {
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

  public Plmpqparam authorizationRequired(Integer authorizationRequired) {
    this.authorizationRequired = authorizationRequired;
    return this;
  }

   /**
   * Požadováno schválení [persistentní položka]
   * @return authorizationRequired
  **/
  @ApiModelProperty(example = "null", value = "Požadováno schválení [persistentní položka]")
  public Integer getAuthorizationRequired() {
    return authorizationRequired;
  }

  public void setAuthorizationRequired(Integer authorizationRequired) {
    this.authorizationRequired = authorizationRequired;
  }

  public Plmpqparam docQueueForJOID(String docQueueForJOID) {
    this.docQueueForJOID = docQueueForJOID;
    return this;
  }

   /**
   * Řada dokladů VP; ID objektu Řada dokladů [persistentní položka]
   * @return docQueueForJOID
  **/
  @ApiModelProperty(example = "null", value = "Řada dokladů VP; ID objektu Řada dokladů [persistentní položka]")
  public String getDocQueueForJOID() {
    return docQueueForJOID;
  }

  public void setDocQueueForJOID(String docQueueForJOID) {
    this.docQueueForJOID = docQueueForJOID;
  }

  public Plmpqparam tariffForJOID(String tariffForJOID) {
    this.tariffForJOID = tariffForJOID;
    return this;
  }

   /**
   * Režijní sazba; ID objektu Režijní sazba [persistentní položka]
   * @return tariffForJOID
  **/
  @ApiModelProperty(example = "null", value = "Režijní sazba; ID objektu Režijní sazba [persistentní položka]")
  public String getTariffForJOID() {
    return tariffForJOID;
  }

  public void setTariffForJOID(String tariffForJOID) {
    this.tariffForJOID = tariffForJOID;
  }

  public Plmpqparam editNorm(Boolean editNorm) {
    this.editNorm = editNorm;
    return this;
  }

   /**
   * Povoleno editovat normu [persistentní položka]
   * @return editNorm
  **/
  @ApiModelProperty(example = "null", value = "Povoleno editovat normu [persistentní položka]")
  public Boolean getEditNorm() {
    return editNorm;
  }

  public void setEditNorm(Boolean editNorm) {
    this.editNorm = editNorm;
  }

  public Plmpqparam defaultManEntRtnID(String defaultManEntRtnID) {
    this.defaultManEntRtnID = defaultManEntRtnID;
    return this;
  }

   /**
   * Výchozí typ tech. postupu pro ruční editaci; ID objektu Typ technologického postupu [persistentní položka]
   * @return defaultManEntRtnID
  **/
  @ApiModelProperty(example = "null", value = "Výchozí typ tech. postupu pro ruční editaci; ID objektu Typ technologického postupu [persistentní položka]")
  public String getDefaultManEntRtnID() {
    return defaultManEntRtnID;
  }

  public void setDefaultManEntRtnID(String defaultManEntRtnID) {
    this.defaultManEntRtnID = defaultManEntRtnID;
  }

  public Plmpqparam noShowDialog(Boolean noShowDialog) {
    this.noShowDialog = noShowDialog;
    return this;
  }

   /**
   * Nezobrazit dialog [persistentní položka]
   * @return noShowDialog
  **/
  @ApiModelProperty(example = "null", value = "Nezobrazit dialog [persistentní položka]")
  public Boolean getNoShowDialog() {
    return noShowDialog;
  }

  public void setNoShowDialog(Boolean noShowDialog) {
    this.noShowDialog = noShowDialog;
  }

  public Plmpqparam methodOfSalaryCalculation(Integer methodOfSalaryCalculation) {
    this.methodOfSalaryCalculation = methodOfSalaryCalculation;
    return this;
  }

   /**
   * Hodinová sazba operace techn. postupu [persistentní položka]
   * @return methodOfSalaryCalculation
  **/
  @ApiModelProperty(example = "null", value = "Hodinová sazba operace techn. postupu [persistentní položka]")
  public Integer getMethodOfSalaryCalculation() {
    return methodOfSalaryCalculation;
  }

  public void setMethodOfSalaryCalculation(Integer methodOfSalaryCalculation) {
    this.methodOfSalaryCalculation = methodOfSalaryCalculation;
  }

  public Plmpqparam methodOfSalaryClass(Integer methodOfSalaryClass) {
    this.methodOfSalaryClass = methodOfSalaryClass;
    return this;
  }

   /**
   * Tarifní třída pro ocenění výrobku [persistentní položka]
   * @return methodOfSalaryClass
  **/
  @ApiModelProperty(example = "null", value = "Tarifní třída pro ocenění výrobku [persistentní položka]")
  public Integer getMethodOfSalaryClass() {
    return methodOfSalaryClass;
  }

  public void setMethodOfSalaryClass(Integer methodOfSalaryClass) {
    this.methodOfSalaryClass = methodOfSalaryClass;
  }

  public Plmpqparam defaultSettingOfMIX(Boolean defaultSettingOfMIX) {
    this.defaultSettingOfMIX = defaultSettingOfMIX;
    return this;
  }

   /**
   * Výchozí nastavení položky MIX [persistentní položka]
   * @return defaultSettingOfMIX
  **/
  @ApiModelProperty(example = "null", value = "Výchozí nastavení položky MIX [persistentní položka]")
  public Boolean getDefaultSettingOfMIX() {
    return defaultSettingOfMIX;
  }

  public void setDefaultSettingOfMIX(Boolean defaultSettingOfMIX) {
    this.defaultSettingOfMIX = defaultSettingOfMIX;
  }

  public Plmpqparam defaultSupposedStoreID(String defaultSupposedStoreID) {
    this.defaultSupposedStoreID = defaultSupposedStoreID;
    return this;
  }

   /**
   * Výchozí předpokládaný sklad; ID objektu Sklad [persistentní položka]
   * @return defaultSupposedStoreID
  **/
  @ApiModelProperty(example = "null", value = "Výchozí předpokládaný sklad; ID objektu Sklad [persistentní položka]")
  public String getDefaultSupposedStoreID() {
    return defaultSupposedStoreID;
  }

  public void setDefaultSupposedStoreID(String defaultSupposedStoreID) {
    this.defaultSupposedStoreID = defaultSupposedStoreID;
  }

  public Plmpqparam inPlan(Boolean inPlan) {
    this.inPlan = inPlan;
    return this;
  }

   /**
   * Započítat do kapacitního plánu [persistentní položka]
   * @return inPlan
  **/
  @ApiModelProperty(example = "null", value = "Započítat do kapacitního plánu [persistentní položka]")
  public Boolean getInPlan() {
    return inPlan;
  }

  public void setInPlan(Boolean inPlan) {
    this.inPlan = inPlan;
  }

  public Plmpqparam firmID(String firmID) {
    this.firmID = firmID;
    return this;
  }

   /**
   * Firma; ID objektu Firma [persistentní položka]
   * @return firmID
  **/
  @ApiModelProperty(example = "null", value = "Firma; ID objektu Firma [persistentní položka]")
  public String getFirmID() {
    return firmID;
  }

  public void setFirmID(String firmID) {
    this.firmID = firmID;
  }

  public Plmpqparam choosingRoutine(Integer choosingRoutine) {
    this.choosingRoutine = choosingRoutine;
    return this;
  }

   /**
   * Výběr TP [persistentní položka]
   * @return choosingRoutine
  **/
  @ApiModelProperty(example = "null", value = "Výběr TP [persistentní položka]")
  public Integer getChoosingRoutine() {
    return choosingRoutine;
  }

  public void setChoosingRoutine(Integer choosingRoutine) {
    this.choosingRoutine = choosingRoutine;
  }

  public Plmpqparam choosingPL(Integer choosingPL) {
    this.choosingPL = choosingPL;
    return this;
  }

   /**
   * Výběr kus. [persistentní položka]
   * @return choosingPL
  **/
  @ApiModelProperty(example = "null", value = "Výběr kus. [persistentní položka]")
  public Integer getChoosingPL() {
    return choosingPL;
  }

  public void setChoosingPL(Integer choosingPL) {
    this.choosingPL = choosingPL;
  }

  public Plmpqparam defaultCanceled(Boolean defaultCanceled) {
    this.defaultCanceled = defaultCanceled;
    return this;
  }

   /**
   * Výchozí - vyloučený z realizace  [persistentní položka]
   * @return defaultCanceled
  **/
  @ApiModelProperty(example = "null", value = "Výchozí - vyloučený z realizace  [persistentní položka]")
  public Boolean getDefaultCanceled() {
    return defaultCanceled;
  }

  public void setDefaultCanceled(Boolean defaultCanceled) {
    this.defaultCanceled = defaultCanceled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plmpqparam plmpqparam = (Plmpqparam) o;
    return Objects.equals(this.displayName, plmpqparam.displayName) &&
        Objects.equals(this.ID, plmpqparam.ID) &&
        Objects.equals(this.classID, plmpqparam.classID) &&
        Objects.equals(this.objVersion, plmpqparam.objVersion) &&
        Objects.equals(this.docQueueID, plmpqparam.docQueueID) &&
        Objects.equals(this.authorizationRequired, plmpqparam.authorizationRequired) &&
        Objects.equals(this.docQueueForJOID, plmpqparam.docQueueForJOID) &&
        Objects.equals(this.tariffForJOID, plmpqparam.tariffForJOID) &&
        Objects.equals(this.editNorm, plmpqparam.editNorm) &&
        Objects.equals(this.defaultManEntRtnID, plmpqparam.defaultManEntRtnID) &&
        Objects.equals(this.noShowDialog, plmpqparam.noShowDialog) &&
        Objects.equals(this.methodOfSalaryCalculation, plmpqparam.methodOfSalaryCalculation) &&
        Objects.equals(this.methodOfSalaryClass, plmpqparam.methodOfSalaryClass) &&
        Objects.equals(this.defaultSettingOfMIX, plmpqparam.defaultSettingOfMIX) &&
        Objects.equals(this.defaultSupposedStoreID, plmpqparam.defaultSupposedStoreID) &&
        Objects.equals(this.inPlan, plmpqparam.inPlan) &&
        Objects.equals(this.firmID, plmpqparam.firmID) &&
        Objects.equals(this.choosingRoutine, plmpqparam.choosingRoutine) &&
        Objects.equals(this.choosingPL, plmpqparam.choosingPL) &&
        Objects.equals(this.defaultCanceled, plmpqparam.defaultCanceled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, docQueueID, authorizationRequired, docQueueForJOID, tariffForJOID, editNorm, defaultManEntRtnID, noShowDialog, methodOfSalaryCalculation, methodOfSalaryClass, defaultSettingOfMIX, defaultSupposedStoreID, inPlan, firmID, choosingRoutine, choosingPL, defaultCanceled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plmpqparam {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    docQueueID: ").append(toIndentedString(docQueueID)).append("\n");
    sb.append("    authorizationRequired: ").append(toIndentedString(authorizationRequired)).append("\n");
    sb.append("    docQueueForJOID: ").append(toIndentedString(docQueueForJOID)).append("\n");
    sb.append("    tariffForJOID: ").append(toIndentedString(tariffForJOID)).append("\n");
    sb.append("    editNorm: ").append(toIndentedString(editNorm)).append("\n");
    sb.append("    defaultManEntRtnID: ").append(toIndentedString(defaultManEntRtnID)).append("\n");
    sb.append("    noShowDialog: ").append(toIndentedString(noShowDialog)).append("\n");
    sb.append("    methodOfSalaryCalculation: ").append(toIndentedString(methodOfSalaryCalculation)).append("\n");
    sb.append("    methodOfSalaryClass: ").append(toIndentedString(methodOfSalaryClass)).append("\n");
    sb.append("    defaultSettingOfMIX: ").append(toIndentedString(defaultSettingOfMIX)).append("\n");
    sb.append("    defaultSupposedStoreID: ").append(toIndentedString(defaultSupposedStoreID)).append("\n");
    sb.append("    inPlan: ").append(toIndentedString(inPlan)).append("\n");
    sb.append("    firmID: ").append(toIndentedString(firmID)).append("\n");
    sb.append("    choosingRoutine: ").append(toIndentedString(choosingRoutine)).append("\n");
    sb.append("    choosingPL: ").append(toIndentedString(choosingPL)).append("\n");
    sb.append("    defaultCanceled: ").append(toIndentedString(defaultCanceled)).append("\n");
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

