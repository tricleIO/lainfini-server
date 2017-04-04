/**
 * abra gen web api (spojení testapi)
 * webové api systému 17.03.03
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
 * Plmcooperation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Plmcooperation   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Plmcoopoutputitem> rows = new ArrayList<Plmcoopoutputitem>();

  @SerializedName("docqueue_id")
  private String docqueueId = null;

  @SerializedName("period_id")
  private String periodId = null;

  @SerializedName("ordnumber")
  private Integer ordnumber = null;

  @SerializedName("docdate$date")
  private DateTime docdatedate = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("newrelatedtype")
  private Integer newrelatedtype = null;

  @SerializedName("newrelateddocument_id")
  private String newrelateddocumentId = null;

  @SerializedName("accpresetdef_id")
  private String accpresetdefId = null;

  @SerializedName("firm_id")
  private String firmId = null;

  @SerializedName("firmoffice_id")
  private String firmofficeId = null;

  @SerializedName("person_id")
  private String personId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("accdate$date")
  private DateTime accdatedate = null;

  @SerializedName("accdocqueue_id")
  private String accdocqueueId = null;

  @SerializedName("accountingtype")
  private Integer accountingtype = null;

  @SerializedName("isaccounted")
  private Boolean isaccounted = null;

  @SerializedName("joborder_id")
  private String joborderId = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("correctedat$date")
  private DateTime correctedatdate = null;

  @SerializedName("takenoffby_id")
  private String takenoffbyId = null;

  @SerializedName("takenoffat$date")
  private DateTime takenoffatdate = null;

  @SerializedName("returnedby_id")
  private String returnedbyId = null;

  @SerializedName("returnedat$date")
  private DateTime returnedatdate = null;

  @SerializedName("issuedorder_id")
  private String issuedorderId = null;

  @SerializedName("planedmaterialprice")
  private Double planedmaterialprice = null;

  @SerializedName("planedworkprice")
  private Double planedworkprice = null;

  @SerializedName("realmaterialprice")
  private Double realmaterialprice = null;

  @SerializedName("realworkprice")
  private Double realworkprice = null;

  @SerializedName("completeprices")
  private Boolean completeprices = null;

  @SerializedName("completerealprice")
  private Double completerealprice = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("planedtakenoffat$date")
  private DateTime planedtakenoffatdate = null;

  @SerializedName("planedreturnedat$date")
  private DateTime planedreturnedatdate = null;

  @SerializedName("issued")
  private Boolean issued = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  @SerializedName("ads")
  private List<Plmcooperationad> ads = new ArrayList<Plmcooperationad>();

  public Plmcooperation displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * Číslo dok.
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "Číslo dok.")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Plmcooperation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * vlastní id [persistentní položka]
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "vlastní id [persistentní položka]")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Plmcooperation classid(String classid) {
    this.classid = classid;
    return this;
  }

   /**
   * id třídy
   * @return classid
  **/
  @ApiModelProperty(example = "null", value = "id třídy")
  public String getClassid() {
    return classid;
  }

  public void setClassid(String classid) {
    this.classid = classid;
  }

  public Plmcooperation objversion(Integer objversion) {
    this.objversion = objversion;
    return this;
  }

   /**
   * verze objektu [persistentní položka]
   * @return objversion
  **/
  @ApiModelProperty(example = "null", value = "verze objektu [persistentní položka]")
  public Integer getObjversion() {
    return objversion;
  }

  public void setObjversion(Integer objversion) {
    this.objversion = objversion;
  }

  public Plmcooperation rows(List<Plmcoopoutputitem> rows) {
    this.rows = rows;
    return this;
  }

  public Plmcooperation addRowsItem(Plmcoopoutputitem rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo koop. - vyráběná položka [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo koop. - vyráběná položka [nepersistentní položka]")
  public List<Plmcoopoutputitem> getRows() {
    return rows;
  }

  public void setRows(List<Plmcoopoutputitem> rows) {
    this.rows = rows;
  }

  public Plmcooperation docqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
    return this;
  }

   /**
   * zdrojová řada; id objektu Řada dokladů [persistentní položka]
   * @return docqueueId
  **/
  @ApiModelProperty(example = "null", value = "zdrojová řada; id objektu Řada dokladů [persistentní položka]")
  public String getDocqueueId() {
    return docqueueId;
  }

  public void setDocqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
  }

  public Plmcooperation periodId(String periodId) {
    this.periodId = periodId;
    return this;
  }

   /**
   * období; id objektu období [persistentní položka]
   * @return periodId
  **/
  @ApiModelProperty(example = "null", value = "období; id objektu období [persistentní položka]")
  public String getPeriodId() {
    return periodId;
  }

  public void setPeriodId(String periodId) {
    this.periodId = periodId;
  }

  public Plmcooperation ordnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
    return this;
  }

   /**
   * pořadové číslo [persistentní položka]
   * @return ordnumber
  **/
  @ApiModelProperty(example = "null", value = "pořadové číslo [persistentní položka]")
  public Integer getOrdnumber() {
    return ordnumber;
  }

  public void setOrdnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
  }

  public Plmcooperation docdatedate(DateTime docdatedate) {
    this.docdatedate = docdatedate;
    return this;
  }

   /**
   * datum dok. [persistentní položka]
   * @return docdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum dok. [persistentní položka]")
  public DateTime getDocdatedate() {
    return docdatedate;
  }

  public void setDocdatedate(DateTime docdatedate) {
    this.docdatedate = docdatedate;
  }

  public Plmcooperation createdbyId(String createdbyId) {
    this.createdbyId = createdbyId;
    return this;
  }

   /**
   * vytvořil; id objektu uživatel [persistentní položka]
   * @return createdbyId
  **/
  @ApiModelProperty(example = "null", value = "vytvořil; id objektu uživatel [persistentní položka]")
  public String getCreatedbyId() {
    return createdbyId;
  }

  public void setCreatedbyId(String createdbyId) {
    this.createdbyId = createdbyId;
  }

  public Plmcooperation correctedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
    return this;
  }

   /**
   * opravil; id objektu uživatel [persistentní položka]
   * @return correctedbyId
  **/
  @ApiModelProperty(example = "null", value = "opravil; id objektu uživatel [persistentní položka]")
  public String getCorrectedbyId() {
    return correctedbyId;
  }

  public void setCorrectedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
  }

  public Plmcooperation newrelatedtype(Integer newrelatedtype) {
    this.newrelatedtype = newrelatedtype;
    return this;
  }

   /**
   * typ relace
   * @return newrelatedtype
  **/
  @ApiModelProperty(example = "null", value = "typ relace")
  public Integer getNewrelatedtype() {
    return newrelatedtype;
  }

  public void setNewrelatedtype(Integer newrelatedtype) {
    this.newrelatedtype = newrelatedtype;
  }

  public Plmcooperation newrelateddocumentId(String newrelateddocumentId) {
    this.newrelateddocumentId = newrelateddocumentId;
    return this;
  }

   /**
   * id dokladu pro připojení
   * @return newrelateddocumentId
  **/
  @ApiModelProperty(example = "null", value = "id dokladu pro připojení")
  public String getNewrelateddocumentId() {
    return newrelateddocumentId;
  }

  public void setNewrelateddocumentId(String newrelateddocumentId) {
    this.newrelateddocumentId = newrelateddocumentId;
  }

  public Plmcooperation accpresetdefId(String accpresetdefId) {
    this.accpresetdefId = accpresetdefId;
    return this;
  }

   /**
   * předkontace; id objektu Účetní předkontace [persistentní položka]
   * @return accpresetdefId
  **/
  @ApiModelProperty(example = "null", value = "předkontace; id objektu Účetní předkontace [persistentní položka]")
  public String getAccpresetdefId() {
    return accpresetdefId;
  }

  public void setAccpresetdefId(String accpresetdefId) {
    this.accpresetdefId = accpresetdefId;
  }

  public Plmcooperation firmId(String firmId) {
    this.firmId = firmId;
    return this;
  }

   /**
   * firma; id objektu firma [persistentní položka]
   * @return firmId
  **/
  @ApiModelProperty(example = "null", value = "firma; id objektu firma [persistentní položka]")
  public String getFirmId() {
    return firmId;
  }

  public void setFirmId(String firmId) {
    this.firmId = firmId;
  }

  public Plmcooperation firmofficeId(String firmofficeId) {
    this.firmofficeId = firmofficeId;
    return this;
  }

   /**
   * provozovna; id objektu provozovna [persistentní položka]
   * @return firmofficeId
  **/
  @ApiModelProperty(example = "null", value = "provozovna; id objektu provozovna [persistentní položka]")
  public String getFirmofficeId() {
    return firmofficeId;
  }

  public void setFirmofficeId(String firmofficeId) {
    this.firmofficeId = firmofficeId;
  }

  public Plmcooperation personId(String personId) {
    this.personId = personId;
    return this;
  }

   /**
   * osoba; id objektu osoba [persistentní položka]
   * @return personId
  **/
  @ApiModelProperty(example = "null", value = "osoba; id objektu osoba [persistentní položka]")
  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }

  public Plmcooperation description(String description) {
    this.description = description;
    return this;
  }

   /**
   * popis [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "popis [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Plmcooperation accdatedate(DateTime accdatedate) {
    this.accdatedate = accdatedate;
    return this;
  }

   /**
   * datum účt. [persistentní položka]
   * @return accdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum účt. [persistentní položka]")
  public DateTime getAccdatedate() {
    return accdatedate;
  }

  public void setAccdatedate(DateTime accdatedate) {
    this.accdatedate = accdatedate;
  }

  public Plmcooperation accdocqueueId(String accdocqueueId) {
    this.accdocqueueId = accdocqueueId;
    return this;
  }

   /**
   * Účetní řada; id objektu Účetní řada dokladů [persistentní položka]
   * @return accdocqueueId
  **/
  @ApiModelProperty(example = "null", value = "Účetní řada; id objektu Účetní řada dokladů [persistentní položka]")
  public String getAccdocqueueId() {
    return accdocqueueId;
  }

  public void setAccdocqueueId(String accdocqueueId) {
    this.accdocqueueId = accdocqueueId;
  }

  public Plmcooperation accountingtype(Integer accountingtype) {
    this.accountingtype = accountingtype;
    return this;
  }

   /**
   * jak účtovat
   * @return accountingtype
  **/
  @ApiModelProperty(example = "null", value = "jak účtovat")
  public Integer getAccountingtype() {
    return accountingtype;
  }

  public void setAccountingtype(Integer accountingtype) {
    this.accountingtype = accountingtype;
  }

  public Plmcooperation isaccounted(Boolean isaccounted) {
    this.isaccounted = isaccounted;
    return this;
  }

   /**
   * Účtováno
   * @return isaccounted
  **/
  @ApiModelProperty(example = "null", value = "Účtováno")
  public Boolean getIsaccounted() {
    return isaccounted;
  }

  public void setIsaccounted(Boolean isaccounted) {
    this.isaccounted = isaccounted;
  }

  public Plmcooperation joborderId(String joborderId) {
    this.joborderId = joborderId;
    return this;
  }

   /**
   * výrobní příkaz; id objektu výrobní příkaz [persistentní položka]
   * @return joborderId
  **/
  @ApiModelProperty(example = "null", value = "výrobní příkaz; id objektu výrobní příkaz [persistentní položka]")
  public String getJoborderId() {
    return joborderId;
  }

  public void setJoborderId(String joborderId) {
    this.joborderId = joborderId;
  }

  public Plmcooperation note(String note) {
    this.note = note;
    return this;
  }

   /**
   * poznámka [persistentní položka]
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "poznámka [persistentní položka]")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Plmcooperation correctedatdate(DateTime correctedatdate) {
    this.correctedatdate = correctedatdate;
    return this;
  }

   /**
   * opravil [persistentní položka]
   * @return correctedatdate
  **/
  @ApiModelProperty(example = "null", value = "opravil [persistentní položka]")
  public DateTime getCorrectedatdate() {
    return correctedatdate;
  }

  public void setCorrectedatdate(DateTime correctedatdate) {
    this.correctedatdate = correctedatdate;
  }

  public Plmcooperation takenoffbyId(String takenoffbyId) {
    this.takenoffbyId = takenoffbyId;
    return this;
  }

   /**
   * odvezl; id objektu uživatel [persistentní položka]
   * @return takenoffbyId
  **/
  @ApiModelProperty(example = "null", value = "odvezl; id objektu uživatel [persistentní položka]")
  public String getTakenoffbyId() {
    return takenoffbyId;
  }

  public void setTakenoffbyId(String takenoffbyId) {
    this.takenoffbyId = takenoffbyId;
  }

  public Plmcooperation takenoffatdate(DateTime takenoffatdate) {
    this.takenoffatdate = takenoffatdate;
    return this;
  }

   /**
   * odvezeno [persistentní položka]
   * @return takenoffatdate
  **/
  @ApiModelProperty(example = "null", value = "odvezeno [persistentní položka]")
  public DateTime getTakenoffatdate() {
    return takenoffatdate;
  }

  public void setTakenoffatdate(DateTime takenoffatdate) {
    this.takenoffatdate = takenoffatdate;
  }

  public Plmcooperation returnedbyId(String returnedbyId) {
    this.returnedbyId = returnedbyId;
    return this;
  }

   /**
   * dovezl zpět; id objektu uživatel [persistentní položka]
   * @return returnedbyId
  **/
  @ApiModelProperty(example = "null", value = "dovezl zpět; id objektu uživatel [persistentní položka]")
  public String getReturnedbyId() {
    return returnedbyId;
  }

  public void setReturnedbyId(String returnedbyId) {
    this.returnedbyId = returnedbyId;
  }

  public Plmcooperation returnedatdate(DateTime returnedatdate) {
    this.returnedatdate = returnedatdate;
    return this;
  }

   /**
   * dovezeno zpět [persistentní položka]
   * @return returnedatdate
  **/
  @ApiModelProperty(example = "null", value = "dovezeno zpět [persistentní položka]")
  public DateTime getReturnedatdate() {
    return returnedatdate;
  }

  public void setReturnedatdate(DateTime returnedatdate) {
    this.returnedatdate = returnedatdate;
  }

  public Plmcooperation issuedorderId(String issuedorderId) {
    this.issuedorderId = issuedorderId;
    return this;
  }

   /**
   * objednávka; id objektu objednávka vydaná [persistentní položka]
   * @return issuedorderId
  **/
  @ApiModelProperty(example = "null", value = "objednávka; id objektu objednávka vydaná [persistentní položka]")
  public String getIssuedorderId() {
    return issuedorderId;
  }

  public void setIssuedorderId(String issuedorderId) {
    this.issuedorderId = issuedorderId;
  }

  public Plmcooperation planedmaterialprice(Double planedmaterialprice) {
    this.planedmaterialprice = planedmaterialprice;
    return this;
  }

   /**
   * plán. cena za materiál [persistentní položka]
   * @return planedmaterialprice
  **/
  @ApiModelProperty(example = "null", value = "plán. cena za materiál [persistentní položka]")
  public Double getPlanedmaterialprice() {
    return planedmaterialprice;
  }

  public void setPlanedmaterialprice(Double planedmaterialprice) {
    this.planedmaterialprice = planedmaterialprice;
  }

  public Plmcooperation planedworkprice(Double planedworkprice) {
    this.planedworkprice = planedworkprice;
    return this;
  }

   /**
   * plán. cena za práci [persistentní položka]
   * @return planedworkprice
  **/
  @ApiModelProperty(example = "null", value = "plán. cena za práci [persistentní položka]")
  public Double getPlanedworkprice() {
    return planedworkprice;
  }

  public void setPlanedworkprice(Double planedworkprice) {
    this.planedworkprice = planedworkprice;
  }

  public Plmcooperation realmaterialprice(Double realmaterialprice) {
    this.realmaterialprice = realmaterialprice;
    return this;
  }

   /**
   * skutečná cena za materiál [persistentní položka]
   * @return realmaterialprice
  **/
  @ApiModelProperty(example = "null", value = "skutečná cena za materiál [persistentní položka]")
  public Double getRealmaterialprice() {
    return realmaterialprice;
  }

  public void setRealmaterialprice(Double realmaterialprice) {
    this.realmaterialprice = realmaterialprice;
  }

  public Plmcooperation realworkprice(Double realworkprice) {
    this.realworkprice = realworkprice;
    return this;
  }

   /**
   * skutečná cena za práci [persistentní položka]
   * @return realworkprice
  **/
  @ApiModelProperty(example = "null", value = "skutečná cena za práci [persistentní položka]")
  public Double getRealworkprice() {
    return realworkprice;
  }

  public void setRealworkprice(Double realworkprice) {
    this.realworkprice = realworkprice;
  }

  public Plmcooperation completeprices(Boolean completeprices) {
    this.completeprices = completeprices;
    return this;
  }

   /**
   * kompletní ceny [persistentní položka]
   * @return completeprices
  **/
  @ApiModelProperty(example = "null", value = "kompletní ceny [persistentní položka]")
  public Boolean getCompleteprices() {
    return completeprices;
  }

  public void setCompleteprices(Boolean completeprices) {
    this.completeprices = completeprices;
  }

  public Plmcooperation completerealprice(Double completerealprice) {
    this.completerealprice = completerealprice;
    return this;
  }

   /**
   * skutečná cena
   * @return completerealprice
  **/
  @ApiModelProperty(example = "null", value = "skutečná cena")
  public Double getCompleterealprice() {
    return completerealprice;
  }

  public void setCompleterealprice(Double completerealprice) {
    this.completerealprice = completerealprice;
  }

  public Plmcooperation busorderId(String busorderId) {
    this.busorderId = busorderId;
    return this;
  }

   /**
   * zakázka; id objektu zakázka [persistentní položka]
   * @return busorderId
  **/
  @ApiModelProperty(example = "null", value = "zakázka; id objektu zakázka [persistentní položka]")
  public String getBusorderId() {
    return busorderId;
  }

  public void setBusorderId(String busorderId) {
    this.busorderId = busorderId;
  }

  public Plmcooperation bustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
    return this;
  }

   /**
   * obch. případ; id objektu obchodní případ [persistentní položka]
   * @return bustransactionId
  **/
  @ApiModelProperty(example = "null", value = "obch. případ; id objektu obchodní případ [persistentní položka]")
  public String getBustransactionId() {
    return bustransactionId;
  }

  public void setBustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
  }

  public Plmcooperation divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }

   /**
   * středisko; id objektu středisko [persistentní položka]
   * @return divisionId
  **/
  @ApiModelProperty(example = "null", value = "středisko; id objektu středisko [persistentní položka]")
  public String getDivisionId() {
    return divisionId;
  }

  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  public Plmcooperation planedtakenoffatdate(DateTime planedtakenoffatdate) {
    this.planedtakenoffatdate = planedtakenoffatdate;
    return this;
  }

   /**
   * plánované odvezení [persistentní položka]
   * @return planedtakenoffatdate
  **/
  @ApiModelProperty(example = "null", value = "plánované odvezení [persistentní položka]")
  public DateTime getPlanedtakenoffatdate() {
    return planedtakenoffatdate;
  }

  public void setPlanedtakenoffatdate(DateTime planedtakenoffatdate) {
    this.planedtakenoffatdate = planedtakenoffatdate;
  }

  public Plmcooperation planedreturnedatdate(DateTime planedreturnedatdate) {
    this.planedreturnedatdate = planedreturnedatdate;
    return this;
  }

   /**
   * plánované přivezení [persistentní položka]
   * @return planedreturnedatdate
  **/
  @ApiModelProperty(example = "null", value = "plánované přivezení [persistentní položka]")
  public DateTime getPlanedreturnedatdate() {
    return planedreturnedatdate;
  }

  public void setPlanedreturnedatdate(DateTime planedreturnedatdate) {
    this.planedreturnedatdate = planedreturnedatdate;
  }

  public Plmcooperation issued(Boolean issued) {
    this.issued = issued;
    return this;
  }

   /**
   * odeslaná objednávka [persistentní položka]
   * @return issued
  **/
  @ApiModelProperty(example = "null", value = "odeslaná objednávka [persistentní položka]")
  public Boolean getIssued() {
    return issued;
  }

  public void setIssued(Boolean issued) {
    this.issued = issued;
  }

  public Plmcooperation busprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
    return this;
  }

   /**
   * projekt; id objektu projekt [persistentní položka]
   * @return busprojectId
  **/
  @ApiModelProperty(example = "null", value = "projekt; id objektu projekt [persistentní položka]")
  public String getBusprojectId() {
    return busprojectId;
  }

  public void setBusprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
  }

  public Plmcooperation ads(List<Plmcooperationad> ads) {
    this.ads = ads;
    return this;
  }

  public Plmcooperation addAdsItem(Plmcooperationad adsItem) {
    this.ads.add(adsItem);
    return this;
  }

   /**
   * oceňování; kolekce bo vazba na vedlejší pořizovací náklady [nepersistentní položka]
   * @return ads
  **/
  @ApiModelProperty(example = "null", value = "oceňování; kolekce bo vazba na vedlejší pořizovací náklady [nepersistentní položka]")
  public List<Plmcooperationad> getAds() {
    return ads;
  }

  public void setAds(List<Plmcooperationad> ads) {
    this.ads = ads;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plmcooperation plmcooperation = (Plmcooperation) o;
    return Objects.equals(this.displayname, plmcooperation.displayname) &&
        Objects.equals(this.id, plmcooperation.id) &&
        Objects.equals(this.classid, plmcooperation.classid) &&
        Objects.equals(this.objversion, plmcooperation.objversion) &&
        Objects.equals(this.rows, plmcooperation.rows) &&
        Objects.equals(this.docqueueId, plmcooperation.docqueueId) &&
        Objects.equals(this.periodId, plmcooperation.periodId) &&
        Objects.equals(this.ordnumber, plmcooperation.ordnumber) &&
        Objects.equals(this.docdatedate, plmcooperation.docdatedate) &&
        Objects.equals(this.createdbyId, plmcooperation.createdbyId) &&
        Objects.equals(this.correctedbyId, plmcooperation.correctedbyId) &&
        Objects.equals(this.newrelatedtype, plmcooperation.newrelatedtype) &&
        Objects.equals(this.newrelateddocumentId, plmcooperation.newrelateddocumentId) &&
        Objects.equals(this.accpresetdefId, plmcooperation.accpresetdefId) &&
        Objects.equals(this.firmId, plmcooperation.firmId) &&
        Objects.equals(this.firmofficeId, plmcooperation.firmofficeId) &&
        Objects.equals(this.personId, plmcooperation.personId) &&
        Objects.equals(this.description, plmcooperation.description) &&
        Objects.equals(this.accdatedate, plmcooperation.accdatedate) &&
        Objects.equals(this.accdocqueueId, plmcooperation.accdocqueueId) &&
        Objects.equals(this.accountingtype, plmcooperation.accountingtype) &&
        Objects.equals(this.isaccounted, plmcooperation.isaccounted) &&
        Objects.equals(this.joborderId, plmcooperation.joborderId) &&
        Objects.equals(this.note, plmcooperation.note) &&
        Objects.equals(this.correctedatdate, plmcooperation.correctedatdate) &&
        Objects.equals(this.takenoffbyId, plmcooperation.takenoffbyId) &&
        Objects.equals(this.takenoffatdate, plmcooperation.takenoffatdate) &&
        Objects.equals(this.returnedbyId, plmcooperation.returnedbyId) &&
        Objects.equals(this.returnedatdate, plmcooperation.returnedatdate) &&
        Objects.equals(this.issuedorderId, plmcooperation.issuedorderId) &&
        Objects.equals(this.planedmaterialprice, plmcooperation.planedmaterialprice) &&
        Objects.equals(this.planedworkprice, plmcooperation.planedworkprice) &&
        Objects.equals(this.realmaterialprice, plmcooperation.realmaterialprice) &&
        Objects.equals(this.realworkprice, plmcooperation.realworkprice) &&
        Objects.equals(this.completeprices, plmcooperation.completeprices) &&
        Objects.equals(this.completerealprice, plmcooperation.completerealprice) &&
        Objects.equals(this.busorderId, plmcooperation.busorderId) &&
        Objects.equals(this.bustransactionId, plmcooperation.bustransactionId) &&
        Objects.equals(this.divisionId, plmcooperation.divisionId) &&
        Objects.equals(this.planedtakenoffatdate, plmcooperation.planedtakenoffatdate) &&
        Objects.equals(this.planedreturnedatdate, plmcooperation.planedreturnedatdate) &&
        Objects.equals(this.issued, plmcooperation.issued) &&
        Objects.equals(this.busprojectId, plmcooperation.busprojectId) &&
        Objects.equals(this.ads, plmcooperation.ads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, docqueueId, periodId, ordnumber, docdatedate, createdbyId, correctedbyId, newrelatedtype, newrelateddocumentId, accpresetdefId, firmId, firmofficeId, personId, description, accdatedate, accdocqueueId, accountingtype, isaccounted, joborderId, note, correctedatdate, takenoffbyId, takenoffatdate, returnedbyId, returnedatdate, issuedorderId, planedmaterialprice, planedworkprice, realmaterialprice, realworkprice, completeprices, completerealprice, busorderId, bustransactionId, divisionId, planedtakenoffatdate, planedreturnedatdate, issued, busprojectId, ads);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plmcooperation {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    docqueueId: ").append(toIndentedString(docqueueId)).append("\n");
    sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
    sb.append("    ordnumber: ").append(toIndentedString(ordnumber)).append("\n");
    sb.append("    docdatedate: ").append(toIndentedString(docdatedate)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    newrelatedtype: ").append(toIndentedString(newrelatedtype)).append("\n");
    sb.append("    newrelateddocumentId: ").append(toIndentedString(newrelateddocumentId)).append("\n");
    sb.append("    accpresetdefId: ").append(toIndentedString(accpresetdefId)).append("\n");
    sb.append("    firmId: ").append(toIndentedString(firmId)).append("\n");
    sb.append("    firmofficeId: ").append(toIndentedString(firmofficeId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accdatedate: ").append(toIndentedString(accdatedate)).append("\n");
    sb.append("    accdocqueueId: ").append(toIndentedString(accdocqueueId)).append("\n");
    sb.append("    accountingtype: ").append(toIndentedString(accountingtype)).append("\n");
    sb.append("    isaccounted: ").append(toIndentedString(isaccounted)).append("\n");
    sb.append("    joborderId: ").append(toIndentedString(joborderId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    correctedatdate: ").append(toIndentedString(correctedatdate)).append("\n");
    sb.append("    takenoffbyId: ").append(toIndentedString(takenoffbyId)).append("\n");
    sb.append("    takenoffatdate: ").append(toIndentedString(takenoffatdate)).append("\n");
    sb.append("    returnedbyId: ").append(toIndentedString(returnedbyId)).append("\n");
    sb.append("    returnedatdate: ").append(toIndentedString(returnedatdate)).append("\n");
    sb.append("    issuedorderId: ").append(toIndentedString(issuedorderId)).append("\n");
    sb.append("    planedmaterialprice: ").append(toIndentedString(planedmaterialprice)).append("\n");
    sb.append("    planedworkprice: ").append(toIndentedString(planedworkprice)).append("\n");
    sb.append("    realmaterialprice: ").append(toIndentedString(realmaterialprice)).append("\n");
    sb.append("    realworkprice: ").append(toIndentedString(realworkprice)).append("\n");
    sb.append("    completeprices: ").append(toIndentedString(completeprices)).append("\n");
    sb.append("    completerealprice: ").append(toIndentedString(completerealprice)).append("\n");
    sb.append("    busorderId: ").append(toIndentedString(busorderId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    planedtakenoffatdate: ").append(toIndentedString(planedtakenoffatdate)).append("\n");
    sb.append("    planedreturnedatdate: ").append(toIndentedString(planedreturnedatdate)).append("\n");
    sb.append("    issued: ").append(toIndentedString(issued)).append("\n");
    sb.append("    busprojectId: ").append(toIndentedString(busprojectId)).append("\n");
    sb.append("    ads: ").append(toIndentedString(ads)).append("\n");
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
