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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Serviceassemblyform
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Serviceassemblyform   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("ServiceDocument_ID")
  private String serviceDocumentID = null;

  @SerializedName("OrdNumber")
  private Integer ordNumber = null;

  @SerializedName("Cooperation")
  private Boolean cooperation = null;

  @SerializedName("CooperationFirm_ID")
  private String cooperationFirmID = null;

  @SerializedName("CooperationFirmOffice_ID")
  private String cooperationFirmOfficeID = null;

  @SerializedName("CooperationPerson_ID")
  private String cooperationPersonID = null;

  @SerializedName("CooperationSurcharge")
  private Double cooperationSurcharge = null;

  @SerializedName("ServiceWorkSpace_ID")
  private String serviceWorkSpaceID = null;

  @SerializedName("AssemblyState")
  private Integer assemblyState = null;

  @SerializedName("StartDate$DATE")
  private DateTime startDateDATE = null;

  @SerializedName("EndDate$DATE")
  private DateTime endDateDATE = null;

  @SerializedName("ResponsibleRole_ID")
  private String responsibleRoleID = null;

  @SerializedName("Note")
  private String note = null;

  @SerializedName("CooperationState")
  private Integer cooperationState = null;

  @SerializedName("CooperationOutDate$DATE")
  private DateTime cooperationOutDateDATE = null;

  @SerializedName("CooperationBackPlanDate$DATE")
  private DateTime cooperationBackPlanDateDATE = null;

  @SerializedName("CooperationBackDate$DATE")
  private DateTime cooperationBackDateDATE = null;

  @SerializedName("CoopTransferOut_ID")
  private String coopTransferOutID = null;

  @SerializedName("CoopTransferBack_ID")
  private String coopTransferBackID = null;

  @SerializedName("AllowIntermediation")
  private Boolean allowIntermediation = null;

  @SerializedName("Rows")
  private List<Serviceassemblyformrow> rows = new ArrayList<Serviceassemblyformrow>();

  @SerializedName("AssemblyStateAsText")
  private String assemblyStateAsText = null;

  @SerializedName("TotalPriceWithoutVAT")
  private Double totalPriceWithoutVAT = null;

  @SerializedName("TotalPriceWithVAT")
  private Double totalPriceWithVAT = null;

  @SerializedName("MaterialOnStockState")
  private Double materialOnStockState = null;

  @SerializedName("MaterialOutStockingState")
  private Double materialOutStockingState = null;

  @SerializedName("CooperationReturn")
  private List<Serviceassemblycoopreceiving> cooperationReturn = new ArrayList<Serviceassemblycoopreceiving>();

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

  public Serviceassemblyform serviceDocumentID(String serviceDocumentID) {
    this.serviceDocumentID = serviceDocumentID;
    return this;
  }

   /**
   * Servisní list; ID objektu Servisní list [persistentní položka]
   * @return serviceDocumentID
  **/
  @ApiModelProperty(example = "null", value = "Servisní list; ID objektu Servisní list [persistentní položka]")
  public String getServiceDocumentID() {
    return serviceDocumentID;
  }

  public void setServiceDocumentID(String serviceDocumentID) {
    this.serviceDocumentID = serviceDocumentID;
  }

  public Serviceassemblyform ordNumber(Integer ordNumber) {
    this.ordNumber = ordNumber;
    return this;
  }

   /**
   * Pořadové číslo [persistentní položka]
   * @return ordNumber
  **/
  @ApiModelProperty(example = "null", value = "Pořadové číslo [persistentní položka]")
  public Integer getOrdNumber() {
    return ordNumber;
  }

  public void setOrdNumber(Integer ordNumber) {
    this.ordNumber = ordNumber;
  }

  public Serviceassemblyform cooperation(Boolean cooperation) {
    this.cooperation = cooperation;
    return this;
  }

   /**
   * Kooperace [persistentní položka]
   * @return cooperation
  **/
  @ApiModelProperty(example = "null", value = "Kooperace [persistentní položka]")
  public Boolean getCooperation() {
    return cooperation;
  }

  public void setCooperation(Boolean cooperation) {
    this.cooperation = cooperation;
  }

  public Serviceassemblyform cooperationFirmID(String cooperationFirmID) {
    this.cooperationFirmID = cooperationFirmID;
    return this;
  }

   /**
   * Kooperace - firma; ID objektu Firma [persistentní položka]
   * @return cooperationFirmID
  **/
  @ApiModelProperty(example = "null", value = "Kooperace - firma; ID objektu Firma [persistentní položka]")
  public String getCooperationFirmID() {
    return cooperationFirmID;
  }

  public void setCooperationFirmID(String cooperationFirmID) {
    this.cooperationFirmID = cooperationFirmID;
  }

  public Serviceassemblyform cooperationFirmOfficeID(String cooperationFirmOfficeID) {
    this.cooperationFirmOfficeID = cooperationFirmOfficeID;
    return this;
  }

   /**
   * Kooperace - provozovna; ID objektu Provozovna [persistentní položka]
   * @return cooperationFirmOfficeID
  **/
  @ApiModelProperty(example = "null", value = "Kooperace - provozovna; ID objektu Provozovna [persistentní položka]")
  public String getCooperationFirmOfficeID() {
    return cooperationFirmOfficeID;
  }

  public void setCooperationFirmOfficeID(String cooperationFirmOfficeID) {
    this.cooperationFirmOfficeID = cooperationFirmOfficeID;
  }

  public Serviceassemblyform cooperationPersonID(String cooperationPersonID) {
    this.cooperationPersonID = cooperationPersonID;
    return this;
  }

   /**
   * Kooperace - osoba; ID objektu Osoba [persistentní položka]
   * @return cooperationPersonID
  **/
  @ApiModelProperty(example = "null", value = "Kooperace - osoba; ID objektu Osoba [persistentní položka]")
  public String getCooperationPersonID() {
    return cooperationPersonID;
  }

  public void setCooperationPersonID(String cooperationPersonID) {
    this.cooperationPersonID = cooperationPersonID;
  }

  public Serviceassemblyform cooperationSurcharge(Double cooperationSurcharge) {
    this.cooperationSurcharge = cooperationSurcharge;
    return this;
  }

   /**
   * Kooperace - marže [persistentní položka]
   * @return cooperationSurcharge
  **/
  @ApiModelProperty(example = "null", value = "Kooperace - marže [persistentní položka]")
  public Double getCooperationSurcharge() {
    return cooperationSurcharge;
  }

  public void setCooperationSurcharge(Double cooperationSurcharge) {
    this.cooperationSurcharge = cooperationSurcharge;
  }

  public Serviceassemblyform serviceWorkSpaceID(String serviceWorkSpaceID) {
    this.serviceWorkSpaceID = serviceWorkSpaceID;
    return this;
  }

   /**
   * Dílna/Pracoviště; ID objektu Servisní dílna/pracoviště [persistentní položka]
   * @return serviceWorkSpaceID
  **/
  @ApiModelProperty(example = "null", value = "Dílna/Pracoviště; ID objektu Servisní dílna/pracoviště [persistentní položka]")
  public String getServiceWorkSpaceID() {
    return serviceWorkSpaceID;
  }

  public void setServiceWorkSpaceID(String serviceWorkSpaceID) {
    this.serviceWorkSpaceID = serviceWorkSpaceID;
  }

  public Serviceassemblyform assemblyState(Integer assemblyState) {
    this.assemblyState = assemblyState;
    return this;
  }

   /**
   * Stav [persistentní položka]
   * @return assemblyState
  **/
  @ApiModelProperty(example = "null", value = "Stav [persistentní položka]")
  public Integer getAssemblyState() {
    return assemblyState;
  }

  public void setAssemblyState(Integer assemblyState) {
    this.assemblyState = assemblyState;
  }

  public Serviceassemblyform startDateDATE(DateTime startDateDATE) {
    this.startDateDATE = startDateDATE;
    return this;
  }

   /**
   * Datum zahájení [persistentní položka]
   * @return startDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum zahájení [persistentní položka]")
  public DateTime getStartDateDATE() {
    return startDateDATE;
  }

  public void setStartDateDATE(DateTime startDateDATE) {
    this.startDateDATE = startDateDATE;
  }

  public Serviceassemblyform endDateDATE(DateTime endDateDATE) {
    this.endDateDATE = endDateDATE;
    return this;
  }

   /**
   * Datum ukončení [persistentní položka]
   * @return endDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum ukončení [persistentní položka]")
  public DateTime getEndDateDATE() {
    return endDateDATE;
  }

  public void setEndDateDATE(DateTime endDateDATE) {
    this.endDateDATE = endDateDATE;
  }

  public Serviceassemblyform responsibleRoleID(String responsibleRoleID) {
    this.responsibleRoleID = responsibleRoleID;
    return this;
  }

   /**
   * Role odpovědné osoby; ID objektu Role [persistentní položka]
   * @return responsibleRoleID
  **/
  @ApiModelProperty(example = "null", value = "Role odpovědné osoby; ID objektu Role [persistentní položka]")
  public String getResponsibleRoleID() {
    return responsibleRoleID;
  }

  public void setResponsibleRoleID(String responsibleRoleID) {
    this.responsibleRoleID = responsibleRoleID;
  }

  public Serviceassemblyform note(String note) {
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

  public Serviceassemblyform cooperationState(Integer cooperationState) {
    this.cooperationState = cooperationState;
    return this;
  }

   /**
   * Stav kooperace [persistentní položka]
   * @return cooperationState
  **/
  @ApiModelProperty(example = "null", value = "Stav kooperace [persistentní položka]")
  public Integer getCooperationState() {
    return cooperationState;
  }

  public void setCooperationState(Integer cooperationState) {
    this.cooperationState = cooperationState;
  }

  public Serviceassemblyform cooperationOutDateDATE(DateTime cooperationOutDateDATE) {
    this.cooperationOutDateDATE = cooperationOutDateDATE;
    return this;
  }

   /**
   * Datum výdeje [persistentní položka]
   * @return cooperationOutDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum výdeje [persistentní položka]")
  public DateTime getCooperationOutDateDATE() {
    return cooperationOutDateDATE;
  }

  public void setCooperationOutDateDATE(DateTime cooperationOutDateDATE) {
    this.cooperationOutDateDATE = cooperationOutDateDATE;
  }

  public Serviceassemblyform cooperationBackPlanDateDATE(DateTime cooperationBackPlanDateDATE) {
    this.cooperationBackPlanDateDATE = cooperationBackPlanDateDATE;
    return this;
  }

   /**
   * Plán.datum návratu [persistentní položka]
   * @return cooperationBackPlanDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Plán.datum návratu [persistentní položka]")
  public DateTime getCooperationBackPlanDateDATE() {
    return cooperationBackPlanDateDATE;
  }

  public void setCooperationBackPlanDateDATE(DateTime cooperationBackPlanDateDATE) {
    this.cooperationBackPlanDateDATE = cooperationBackPlanDateDATE;
  }

  public Serviceassemblyform cooperationBackDateDATE(DateTime cooperationBackDateDATE) {
    this.cooperationBackDateDATE = cooperationBackDateDATE;
    return this;
  }

   /**
   * Datum návratu [persistentní položka]
   * @return cooperationBackDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum návratu [persistentní položka]")
  public DateTime getCooperationBackDateDATE() {
    return cooperationBackDateDATE;
  }

  public void setCooperationBackDateDATE(DateTime cooperationBackDateDATE) {
    this.cooperationBackDateDATE = cooperationBackDateDATE;
  }

  public Serviceassemblyform coopTransferOutID(String coopTransferOutID) {
    this.coopTransferOutID = coopTransferOutID;
    return this;
  }

   /**
   * Převodka do kooperace; ID objektu Převodka výdej [persistentní položka]
   * @return coopTransferOutID
  **/
  @ApiModelProperty(example = "null", value = "Převodka do kooperace; ID objektu Převodka výdej [persistentní položka]")
  public String getCoopTransferOutID() {
    return coopTransferOutID;
  }

  public void setCoopTransferOutID(String coopTransferOutID) {
    this.coopTransferOutID = coopTransferOutID;
  }

  public Serviceassemblyform coopTransferBackID(String coopTransferBackID) {
    this.coopTransferBackID = coopTransferBackID;
    return this;
  }

   /**
   * Převodka z kooperace; ID objektu Skladový doklad [persistentní položka]
   * @return coopTransferBackID
  **/
  @ApiModelProperty(example = "null", value = "Převodka z kooperace; ID objektu Skladový doklad [persistentní položka]")
  public String getCoopTransferBackID() {
    return coopTransferBackID;
  }

  public void setCoopTransferBackID(String coopTransferBackID) {
    this.coopTransferBackID = coopTransferBackID;
  }

  public Serviceassemblyform allowIntermediation(Boolean allowIntermediation) {
    this.allowIntermediation = allowIntermediation;
    return this;
  }

   /**
   * Umožnit přefakturaci [persistentní položka]
   * @return allowIntermediation
  **/
  @ApiModelProperty(example = "null", value = "Umožnit přefakturaci [persistentní položka]")
  public Boolean getAllowIntermediation() {
    return allowIntermediation;
  }

  public void setAllowIntermediation(Boolean allowIntermediation) {
    this.allowIntermediation = allowIntermediation;
  }

  public Serviceassemblyform rows(List<Serviceassemblyformrow> rows) {
    this.rows = rows;
    return this;
  }

  public Serviceassemblyform addRowsItem(Serviceassemblyformrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce BO Řádek montážního listu [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce BO Řádek montážního listu [nepersistentní položka]")
  public List<Serviceassemblyformrow> getRows() {
    return rows;
  }

  public void setRows(List<Serviceassemblyformrow> rows) {
    this.rows = rows;
  }

  public Serviceassemblyform assemblyStateAsText(String assemblyStateAsText) {
    this.assemblyStateAsText = assemblyStateAsText;
    return this;
  }

   /**
   * Stav
   * @return assemblyStateAsText
  **/
  @ApiModelProperty(example = "null", value = "Stav")
  public String getAssemblyStateAsText() {
    return assemblyStateAsText;
  }

  public void setAssemblyStateAsText(String assemblyStateAsText) {
    this.assemblyStateAsText = assemblyStateAsText;
  }

  public Serviceassemblyform totalPriceWithoutVAT(Double totalPriceWithoutVAT) {
    this.totalPriceWithoutVAT = totalPriceWithoutVAT;
    return this;
  }

   /**
   * Celk.cena bez DPH
   * @return totalPriceWithoutVAT
  **/
  @ApiModelProperty(example = "null", value = "Celk.cena bez DPH")
  public Double getTotalPriceWithoutVAT() {
    return totalPriceWithoutVAT;
  }

  public void setTotalPriceWithoutVAT(Double totalPriceWithoutVAT) {
    this.totalPriceWithoutVAT = totalPriceWithoutVAT;
  }

  public Serviceassemblyform totalPriceWithVAT(Double totalPriceWithVAT) {
    this.totalPriceWithVAT = totalPriceWithVAT;
    return this;
  }

   /**
   * Celk.cena s DPH
   * @return totalPriceWithVAT
  **/
  @ApiModelProperty(example = "null", value = "Celk.cena s DPH")
  public Double getTotalPriceWithVAT() {
    return totalPriceWithVAT;
  }

  public void setTotalPriceWithVAT(Double totalPriceWithVAT) {
    this.totalPriceWithVAT = totalPriceWithVAT;
  }

  public Serviceassemblyform materialOnStockState(Double materialOnStockState) {
    this.materialOnStockState = materialOnStockState;
    return this;
  }

   /**
   * Pokrytí skladem
   * @return materialOnStockState
  **/
  @ApiModelProperty(example = "null", value = "Pokrytí skladem")
  public Double getMaterialOnStockState() {
    return materialOnStockState;
  }

  public void setMaterialOnStockState(Double materialOnStockState) {
    this.materialOnStockState = materialOnStockState;
  }

  public Serviceassemblyform materialOutStockingState(Double materialOutStockingState) {
    this.materialOutStockingState = materialOutStockingState;
    return this;
  }

   /**
   * Vyskladněno
   * @return materialOutStockingState
  **/
  @ApiModelProperty(example = "null", value = "Vyskladněno")
  public Double getMaterialOutStockingState() {
    return materialOutStockingState;
  }

  public void setMaterialOutStockingState(Double materialOutStockingState) {
    this.materialOutStockingState = materialOutStockingState;
  }

  public Serviceassemblyform cooperationReturn(List<Serviceassemblycoopreceiving> cooperationReturn) {
    this.cooperationReturn = cooperationReturn;
    return this;
  }

  public Serviceassemblyform addCooperationReturnItem(Serviceassemblycoopreceiving cooperationReturnItem) {
    this.cooperationReturn.add(cooperationReturnItem);
    return this;
  }

   /**
   * Návraty z kooperace; kolekce BO Vrácení zpět z koop. pro ML [nepersistentní položka]
   * @return cooperationReturn
  **/
  @ApiModelProperty(example = "null", value = "Návraty z kooperace; kolekce BO Vrácení zpět z koop. pro ML [nepersistentní položka]")
  public List<Serviceassemblycoopreceiving> getCooperationReturn() {
    return cooperationReturn;
  }

  public void setCooperationReturn(List<Serviceassemblycoopreceiving> cooperationReturn) {
    this.cooperationReturn = cooperationReturn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Serviceassemblyform serviceassemblyform = (Serviceassemblyform) o;
    return Objects.equals(this.displayName, serviceassemblyform.displayName) &&
        Objects.equals(this.ID, serviceassemblyform.ID) &&
        Objects.equals(this.classID, serviceassemblyform.classID) &&
        Objects.equals(this.objVersion, serviceassemblyform.objVersion) &&
        Objects.equals(this.serviceDocumentID, serviceassemblyform.serviceDocumentID) &&
        Objects.equals(this.ordNumber, serviceassemblyform.ordNumber) &&
        Objects.equals(this.cooperation, serviceassemblyform.cooperation) &&
        Objects.equals(this.cooperationFirmID, serviceassemblyform.cooperationFirmID) &&
        Objects.equals(this.cooperationFirmOfficeID, serviceassemblyform.cooperationFirmOfficeID) &&
        Objects.equals(this.cooperationPersonID, serviceassemblyform.cooperationPersonID) &&
        Objects.equals(this.cooperationSurcharge, serviceassemblyform.cooperationSurcharge) &&
        Objects.equals(this.serviceWorkSpaceID, serviceassemblyform.serviceWorkSpaceID) &&
        Objects.equals(this.assemblyState, serviceassemblyform.assemblyState) &&
        Objects.equals(this.startDateDATE, serviceassemblyform.startDateDATE) &&
        Objects.equals(this.endDateDATE, serviceassemblyform.endDateDATE) &&
        Objects.equals(this.responsibleRoleID, serviceassemblyform.responsibleRoleID) &&
        Objects.equals(this.note, serviceassemblyform.note) &&
        Objects.equals(this.cooperationState, serviceassemblyform.cooperationState) &&
        Objects.equals(this.cooperationOutDateDATE, serviceassemblyform.cooperationOutDateDATE) &&
        Objects.equals(this.cooperationBackPlanDateDATE, serviceassemblyform.cooperationBackPlanDateDATE) &&
        Objects.equals(this.cooperationBackDateDATE, serviceassemblyform.cooperationBackDateDATE) &&
        Objects.equals(this.coopTransferOutID, serviceassemblyform.coopTransferOutID) &&
        Objects.equals(this.coopTransferBackID, serviceassemblyform.coopTransferBackID) &&
        Objects.equals(this.allowIntermediation, serviceassemblyform.allowIntermediation) &&
        Objects.equals(this.rows, serviceassemblyform.rows) &&
        Objects.equals(this.assemblyStateAsText, serviceassemblyform.assemblyStateAsText) &&
        Objects.equals(this.totalPriceWithoutVAT, serviceassemblyform.totalPriceWithoutVAT) &&
        Objects.equals(this.totalPriceWithVAT, serviceassemblyform.totalPriceWithVAT) &&
        Objects.equals(this.materialOnStockState, serviceassemblyform.materialOnStockState) &&
        Objects.equals(this.materialOutStockingState, serviceassemblyform.materialOutStockingState) &&
        Objects.equals(this.cooperationReturn, serviceassemblyform.cooperationReturn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, serviceDocumentID, ordNumber, cooperation, cooperationFirmID, cooperationFirmOfficeID, cooperationPersonID, cooperationSurcharge, serviceWorkSpaceID, assemblyState, startDateDATE, endDateDATE, responsibleRoleID, note, cooperationState, cooperationOutDateDATE, cooperationBackPlanDateDATE, cooperationBackDateDATE, coopTransferOutID, coopTransferBackID, allowIntermediation, rows, assemblyStateAsText, totalPriceWithoutVAT, totalPriceWithVAT, materialOnStockState, materialOutStockingState, cooperationReturn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Serviceassemblyform {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    serviceDocumentID: ").append(toIndentedString(serviceDocumentID)).append("\n");
    sb.append("    ordNumber: ").append(toIndentedString(ordNumber)).append("\n");
    sb.append("    cooperation: ").append(toIndentedString(cooperation)).append("\n");
    sb.append("    cooperationFirmID: ").append(toIndentedString(cooperationFirmID)).append("\n");
    sb.append("    cooperationFirmOfficeID: ").append(toIndentedString(cooperationFirmOfficeID)).append("\n");
    sb.append("    cooperationPersonID: ").append(toIndentedString(cooperationPersonID)).append("\n");
    sb.append("    cooperationSurcharge: ").append(toIndentedString(cooperationSurcharge)).append("\n");
    sb.append("    serviceWorkSpaceID: ").append(toIndentedString(serviceWorkSpaceID)).append("\n");
    sb.append("    assemblyState: ").append(toIndentedString(assemblyState)).append("\n");
    sb.append("    startDateDATE: ").append(toIndentedString(startDateDATE)).append("\n");
    sb.append("    endDateDATE: ").append(toIndentedString(endDateDATE)).append("\n");
    sb.append("    responsibleRoleID: ").append(toIndentedString(responsibleRoleID)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    cooperationState: ").append(toIndentedString(cooperationState)).append("\n");
    sb.append("    cooperationOutDateDATE: ").append(toIndentedString(cooperationOutDateDATE)).append("\n");
    sb.append("    cooperationBackPlanDateDATE: ").append(toIndentedString(cooperationBackPlanDateDATE)).append("\n");
    sb.append("    cooperationBackDateDATE: ").append(toIndentedString(cooperationBackDateDATE)).append("\n");
    sb.append("    coopTransferOutID: ").append(toIndentedString(coopTransferOutID)).append("\n");
    sb.append("    coopTransferBackID: ").append(toIndentedString(coopTransferBackID)).append("\n");
    sb.append("    allowIntermediation: ").append(toIndentedString(allowIntermediation)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    assemblyStateAsText: ").append(toIndentedString(assemblyStateAsText)).append("\n");
    sb.append("    totalPriceWithoutVAT: ").append(toIndentedString(totalPriceWithoutVAT)).append("\n");
    sb.append("    totalPriceWithVAT: ").append(toIndentedString(totalPriceWithVAT)).append("\n");
    sb.append("    materialOnStockState: ").append(toIndentedString(materialOnStockState)).append("\n");
    sb.append("    materialOutStockingState: ").append(toIndentedString(materialOutStockingState)).append("\n");
    sb.append("    cooperationReturn: ").append(toIndentedString(cooperationReturn)).append("\n");
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

