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
 * Docqueue
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Docqueue   {
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

  @SerializedName("Code")
  private String code = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("LastNumbers")
  private List<Docqueueperiod> lastNumbers = new ArrayList<Docqueueperiod>();

  @SerializedName("Note")
  private String note = null;

  @SerializedName("DocumentType")
  private String documentType = null;

  @SerializedName("ToAccount")
  private Boolean toAccount = null;

  @SerializedName("SummaryAccounted")
  private Boolean summaryAccounted = null;

  @SerializedName("ForceAccounting")
  private Boolean forceAccounting = null;

  @SerializedName("SingleAccDocQueue_ID")
  private Docqueue singleAccDocQueueID = null;

  @SerializedName("SummaryAccDocQueue_ID")
  private Docqueue summaryAccDocQueueID = null;

  @SerializedName("PrefixVar")
  private Integer prefixVar = null;

  @SerializedName("FirstOpenPeriod_ID")
  private String firstOpenPeriodID = null;

  @SerializedName("LastOpenPeriod_ID")
  private String lastOpenPeriodID = null;

  @SerializedName("Account_ID")
  private String accountID = null;

  @SerializedName("OutOfUse")
  private Boolean outOfUse = null;

  @SerializedName("ExpenseType_ID")
  private String expenseTypeID = null;

  @SerializedName("IncomeType_ID")
  private String incomeTypeID = null;

  @SerializedName("EditExtNumOnRows")
  private Boolean editExtNumOnRows = null;

  @SerializedName("CreateReservations")
  private Boolean createReservations = null;

  @SerializedName("PrefillCurrencyFromFirm")
  private Boolean prefillCurrencyFromFirm = null;

  @SerializedName("EETEstablishment_ID")
  private String eETEstablishmentID = null;

  @SerializedName("OtherDocElectronicPayment")
  private Boolean otherDocElectronicPayment = null;

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

  public Docqueue hidden(Boolean hidden) {
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

  public Docqueue code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Zkratka [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "Zkratka [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Docqueue name(String name) {
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

  public Docqueue lastNumbers(List<Docqueueperiod> lastNumbers) {
    this.lastNumbers = lastNumbers;
    return this;
  }

  public Docqueue addLastNumbersItem(Docqueueperiod lastNumbersItem) {
    this.lastNumbers.add(lastNumbersItem);
    return this;
  }

   /**
   * Čísla; kolekce BO Řada dokladů - období [nepersistentní položka]
   * @return lastNumbers
  **/
  @ApiModelProperty(example = "null", value = "Čísla; kolekce BO Řada dokladů - období [nepersistentní položka]")
  public List<Docqueueperiod> getLastNumbers() {
    return lastNumbers;
  }

  public void setLastNumbers(List<Docqueueperiod> lastNumbers) {
    this.lastNumbers = lastNumbers;
  }

  public Docqueue note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Poznámka [persistentní položka]
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "Poznámka [persistentní položka]")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Docqueue documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * Typ dokladu [persistentní položka]
   * @return documentType
  **/
  @ApiModelProperty(example = "null", value = "Typ dokladu [persistentní položka]")
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public Docqueue toAccount(Boolean toAccount) {
    this.toAccount = toAccount;
    return this;
  }

   /**
   * Účtovat [persistentní položka]
   * @return toAccount
  **/
  @ApiModelProperty(example = "null", value = "Účtovat [persistentní položka]")
  public Boolean getToAccount() {
    return toAccount;
  }

  public void setToAccount(Boolean toAccount) {
    this.toAccount = toAccount;
  }

  public Docqueue summaryAccounted(Boolean summaryAccounted) {
    this.summaryAccounted = summaryAccounted;
    return this;
  }

   /**
   * Souhrnně [persistentní položka]
   * @return summaryAccounted
  **/
  @ApiModelProperty(example = "null", value = "Souhrnně [persistentní položka]")
  public Boolean getSummaryAccounted() {
    return summaryAccounted;
  }

  public void setSummaryAccounted(Boolean summaryAccounted) {
    this.summaryAccounted = summaryAccounted;
  }

  public Docqueue forceAccounting(Boolean forceAccounting) {
    this.forceAccounting = forceAccounting;
    return this;
  }

   /**
   * Přeúčtovat vždy [persistentní položka]
   * @return forceAccounting
  **/
  @ApiModelProperty(example = "null", value = "Přeúčtovat vždy [persistentní položka]")
  public Boolean getForceAccounting() {
    return forceAccounting;
  }

  public void setForceAccounting(Boolean forceAccounting) {
    this.forceAccounting = forceAccounting;
  }

  public Docqueue singleAccDocQueueID(Docqueue singleAccDocQueueID) {
    this.singleAccDocQueueID = singleAccDocQueueID;
    return this;
  }

   /**
   * Get singleAccDocQueueID
   * @return singleAccDocQueueID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Docqueue getSingleAccDocQueueID() {
    return singleAccDocQueueID;
  }

  public void setSingleAccDocQueueID(Docqueue singleAccDocQueueID) {
    this.singleAccDocQueueID = singleAccDocQueueID;
  }

  public Docqueue summaryAccDocQueueID(Docqueue summaryAccDocQueueID) {
    this.summaryAccDocQueueID = summaryAccDocQueueID;
    return this;
  }

   /**
   * Get summaryAccDocQueueID
   * @return summaryAccDocQueueID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Docqueue getSummaryAccDocQueueID() {
    return summaryAccDocQueueID;
  }

  public void setSummaryAccDocQueueID(Docqueue summaryAccDocQueueID) {
    this.summaryAccDocQueueID = summaryAccDocQueueID;
  }

  public Docqueue prefixVar(Integer prefixVar) {
    this.prefixVar = prefixVar;
    return this;
  }

   /**
   * Prefix řady [persistentní položka]
   * @return prefixVar
  **/
  @ApiModelProperty(example = "null", value = "Prefix řady [persistentní položka]")
  public Integer getPrefixVar() {
    return prefixVar;
  }

  public void setPrefixVar(Integer prefixVar) {
    this.prefixVar = prefixVar;
  }

  public Docqueue firstOpenPeriodID(String firstOpenPeriodID) {
    this.firstOpenPeriodID = firstOpenPeriodID;
    return this;
  }

   /**
   * První otevřené období; ID objektu Období [persistentní položka]
   * @return firstOpenPeriodID
  **/
  @ApiModelProperty(example = "null", value = "První otevřené období; ID objektu Období [persistentní položka]")
  public String getFirstOpenPeriodID() {
    return firstOpenPeriodID;
  }

  public void setFirstOpenPeriodID(String firstOpenPeriodID) {
    this.firstOpenPeriodID = firstOpenPeriodID;
  }

   /**
   * Poslední otevřené období; ID objektu Období [persistentní položka]
   * @return lastOpenPeriodID
  **/
  @ApiModelProperty(example = "null", value = "Poslední otevřené období; ID objektu Období [persistentní položka]")
  public String getLastOpenPeriodID() {
    return lastOpenPeriodID;
  }

  public Docqueue accountID(String accountID) {
    this.accountID = accountID;
    return this;
  }

   /**
   * Účet; ID objektu Účet účetního rozvrhu [persistentní položka]
   * @return accountID
  **/
  @ApiModelProperty(example = "null", value = "Účet; ID objektu Účet účetního rozvrhu [persistentní položka]")
  public String getAccountID() {
    return accountID;
  }

  public void setAccountID(String accountID) {
    this.accountID = accountID;
  }

  public Docqueue outOfUse(Boolean outOfUse) {
    this.outOfUse = outOfUse;
    return this;
  }

   /**
   * Nepoužívaná řada [persistentní položka]
   * @return outOfUse
  **/
  @ApiModelProperty(example = "null", value = "Nepoužívaná řada [persistentní položka]")
  public Boolean getOutOfUse() {
    return outOfUse;
  }

  public void setOutOfUse(Boolean outOfUse) {
    this.outOfUse = outOfUse;
  }

  public Docqueue expenseTypeID(String expenseTypeID) {
    this.expenseTypeID = expenseTypeID;
    return this;
  }

   /**
   * Typ výdaje; ID objektu Typ výdaje [persistentní položka]
   * @return expenseTypeID
  **/
  @ApiModelProperty(example = "null", value = "Typ výdaje; ID objektu Typ výdaje [persistentní položka]")
  public String getExpenseTypeID() {
    return expenseTypeID;
  }

  public void setExpenseTypeID(String expenseTypeID) {
    this.expenseTypeID = expenseTypeID;
  }

  public Docqueue incomeTypeID(String incomeTypeID) {
    this.incomeTypeID = incomeTypeID;
    return this;
  }

   /**
   * Typ příjmu; ID objektu Typ příjmu [persistentní položka]
   * @return incomeTypeID
  **/
  @ApiModelProperty(example = "null", value = "Typ příjmu; ID objektu Typ příjmu [persistentní položka]")
  public String getIncomeTypeID() {
    return incomeTypeID;
  }

  public void setIncomeTypeID(String incomeTypeID) {
    this.incomeTypeID = incomeTypeID;
  }

  public Docqueue editExtNumOnRows(Boolean editExtNumOnRows) {
    this.editExtNumOnRows = editExtNumOnRows;
    return this;
  }

   /**
   * Zadávat externí číslo na řádcích [persistentní položka]
   * @return editExtNumOnRows
  **/
  @ApiModelProperty(example = "null", value = "Zadávat externí číslo na řádcích [persistentní položka]")
  public Boolean getEditExtNumOnRows() {
    return editExtNumOnRows;
  }

  public void setEditExtNumOnRows(Boolean editExtNumOnRows) {
    this.editExtNumOnRows = editExtNumOnRows;
  }

  public Docqueue createReservations(Boolean createReservations) {
    this.createReservations = createReservations;
    return this;
  }

   /**
   * Vytvořit rezervace [persistentní položka]
   * @return createReservations
  **/
  @ApiModelProperty(example = "null", value = "Vytvořit rezervace [persistentní položka]")
  public Boolean getCreateReservations() {
    return createReservations;
  }

  public void setCreateReservations(Boolean createReservations) {
    this.createReservations = createReservations;
  }

  public Docqueue prefillCurrencyFromFirm(Boolean prefillCurrencyFromFirm) {
    this.prefillCurrencyFromFirm = prefillCurrencyFromFirm;
    return this;
  }

   /**
   * Předvyplnit měnu dle firmy [persistentní položka]
   * @return prefillCurrencyFromFirm
  **/
  @ApiModelProperty(example = "null", value = "Předvyplnit měnu dle firmy [persistentní položka]")
  public Boolean getPrefillCurrencyFromFirm() {
    return prefillCurrencyFromFirm;
  }

  public void setPrefillCurrencyFromFirm(Boolean prefillCurrencyFromFirm) {
    this.prefillCurrencyFromFirm = prefillCurrencyFromFirm;
  }

  public Docqueue eETEstablishmentID(String eETEstablishmentID) {
    this.eETEstablishmentID = eETEstablishmentID;
    return this;
  }

   /**
   * Provozovna EET; ID objektu Provozovna EET [persistentní položka]
   * @return eETEstablishmentID
  **/
  @ApiModelProperty(example = "null", value = "Provozovna EET; ID objektu Provozovna EET [persistentní položka]")
  public String getEETEstablishmentID() {
    return eETEstablishmentID;
  }

  public void setEETEstablishmentID(String eETEstablishmentID) {
    this.eETEstablishmentID = eETEstablishmentID;
  }

  public Docqueue otherDocElectronicPayment(Boolean otherDocElectronicPayment) {
    this.otherDocElectronicPayment = otherDocElectronicPayment;
    return this;
  }

   /**
   * Pro evidenci elektronické platby [persistentní položka]
   * @return otherDocElectronicPayment
  **/
  @ApiModelProperty(example = "null", value = "Pro evidenci elektronické platby [persistentní položka]")
  public Boolean getOtherDocElectronicPayment() {
    return otherDocElectronicPayment;
  }

  public void setOtherDocElectronicPayment(Boolean otherDocElectronicPayment) {
    this.otherDocElectronicPayment = otherDocElectronicPayment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Docqueue docqueue = (Docqueue) o;
    return Objects.equals(this.displayName, docqueue.displayName) &&
        Objects.equals(this.ID, docqueue.ID) &&
        Objects.equals(this.classID, docqueue.classID) &&
        Objects.equals(this.objVersion, docqueue.objVersion) &&
        Objects.equals(this.hidden, docqueue.hidden) &&
        Objects.equals(this.code, docqueue.code) &&
        Objects.equals(this.name, docqueue.name) &&
        Objects.equals(this.lastNumbers, docqueue.lastNumbers) &&
        Objects.equals(this.note, docqueue.note) &&
        Objects.equals(this.documentType, docqueue.documentType) &&
        Objects.equals(this.toAccount, docqueue.toAccount) &&
        Objects.equals(this.summaryAccounted, docqueue.summaryAccounted) &&
        Objects.equals(this.forceAccounting, docqueue.forceAccounting) &&
        Objects.equals(this.singleAccDocQueueID, docqueue.singleAccDocQueueID) &&
        Objects.equals(this.summaryAccDocQueueID, docqueue.summaryAccDocQueueID) &&
        Objects.equals(this.prefixVar, docqueue.prefixVar) &&
        Objects.equals(this.firstOpenPeriodID, docqueue.firstOpenPeriodID) &&
        Objects.equals(this.lastOpenPeriodID, docqueue.lastOpenPeriodID) &&
        Objects.equals(this.accountID, docqueue.accountID) &&
        Objects.equals(this.outOfUse, docqueue.outOfUse) &&
        Objects.equals(this.expenseTypeID, docqueue.expenseTypeID) &&
        Objects.equals(this.incomeTypeID, docqueue.incomeTypeID) &&
        Objects.equals(this.editExtNumOnRows, docqueue.editExtNumOnRows) &&
        Objects.equals(this.createReservations, docqueue.createReservations) &&
        Objects.equals(this.prefillCurrencyFromFirm, docqueue.prefillCurrencyFromFirm) &&
        Objects.equals(this.eETEstablishmentID, docqueue.eETEstablishmentID) &&
        Objects.equals(this.otherDocElectronicPayment, docqueue.otherDocElectronicPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, hidden, code, name, lastNumbers, note, documentType, toAccount, summaryAccounted, forceAccounting, singleAccDocQueueID, summaryAccDocQueueID, prefixVar, firstOpenPeriodID, lastOpenPeriodID, accountID, outOfUse, expenseTypeID, incomeTypeID, editExtNumOnRows, createReservations, prefillCurrencyFromFirm, eETEstablishmentID, otherDocElectronicPayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Docqueue {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastNumbers: ").append(toIndentedString(lastNumbers)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    summaryAccounted: ").append(toIndentedString(summaryAccounted)).append("\n");
    sb.append("    forceAccounting: ").append(toIndentedString(forceAccounting)).append("\n");
    sb.append("    singleAccDocQueueID: ").append(toIndentedString(singleAccDocQueueID)).append("\n");
    sb.append("    summaryAccDocQueueID: ").append(toIndentedString(summaryAccDocQueueID)).append("\n");
    sb.append("    prefixVar: ").append(toIndentedString(prefixVar)).append("\n");
    sb.append("    firstOpenPeriodID: ").append(toIndentedString(firstOpenPeriodID)).append("\n");
    sb.append("    lastOpenPeriodID: ").append(toIndentedString(lastOpenPeriodID)).append("\n");
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    outOfUse: ").append(toIndentedString(outOfUse)).append("\n");
    sb.append("    expenseTypeID: ").append(toIndentedString(expenseTypeID)).append("\n");
    sb.append("    incomeTypeID: ").append(toIndentedString(incomeTypeID)).append("\n");
    sb.append("    editExtNumOnRows: ").append(toIndentedString(editExtNumOnRows)).append("\n");
    sb.append("    createReservations: ").append(toIndentedString(createReservations)).append("\n");
    sb.append("    prefillCurrencyFromFirm: ").append(toIndentedString(prefillCurrencyFromFirm)).append("\n");
    sb.append("    eETEstablishmentID: ").append(toIndentedString(eETEstablishmentID)).append("\n");
    sb.append("    otherDocElectronicPayment: ").append(toIndentedString(otherDocElectronicPayment)).append("\n");
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

