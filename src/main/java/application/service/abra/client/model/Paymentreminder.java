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
 * Paymentreminder
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Paymentreminder   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Paymentreminderrow> rows = new ArrayList<Paymentreminderrow>();

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

  @SerializedName("firm_id")
  private String firmId = null;

  @SerializedName("firmoffice_id")
  private String firmofficeId = null;

  @SerializedName("person_id")
  private String personId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("accountingtype")
  private Integer accountingtype = null;

  @SerializedName("isaccounted")
  private Boolean isaccounted = null;

  @SerializedName("dirty")
  private Boolean dirty = null;

  @SerializedName("country_id")
  private String countryId = null;

  @SerializedName("currency_id")
  private String currencyId = null;

  @SerializedName("currrate")
  private Double currrate = null;

  @SerializedName("refcurrrate")
  private Double refcurrrate = null;

  @SerializedName("coef")
  private Integer coef = null;

  @SerializedName("localcoef")
  private Integer localcoef = null;

  @SerializedName("zone_id")
  private String zoneId = null;

  @SerializedName("localzone_id")
  private String localzoneId = null;

  @SerializedName("refcurrency_id")
  private String refcurrencyId = null;

  @SerializedName("localrefcurrency_id")
  private String localrefcurrencyId = null;

  @SerializedName("currrateinfo")
  private String currrateinfo = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("localamount")
  private Double localamount = null;

  @SerializedName("address_id")
  private String addressId = null;

  @SerializedName("totalrounding")
  private Integer totalrounding = null;

  @SerializedName("roundingamount")
  private Double roundingamount = null;

  @SerializedName("localroundingamount")
  private Double localroundingamount = null;

  @SerializedName("penaltypercent")
  private Double penaltypercent = null;

  @SerializedName("docorder")
  private Integer docorder = null;

  @SerializedName("calculating")
  private Boolean calculating = null;

  @SerializedName("ispenaltyfromratetable")
  private Boolean ispenaltyfromratetable = null;

  @SerializedName("issuedinvoice_id")
  private String issuedinvoiceId = null;

  @SerializedName("lastpenaltyinvoice")
  private String lastpenaltyinvoice = null;

  @SerializedName("createdat$date")
  private DateTime createdatdate = null;

  @SerializedName("correctedat$date")
  private DateTime correctedatdate = null;

  public Paymentreminder displayname(String displayname) {
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

  public Paymentreminder id(String id) {
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

  public Paymentreminder classid(String classid) {
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

  public Paymentreminder objversion(Integer objversion) {
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

  public Paymentreminder rows(List<Paymentreminderrow> rows) {
    this.rows = rows;
    return this;
  }

  public Paymentreminder addRowsItem(Paymentreminderrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo upomínka - řádek [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo upomínka - řádek [nepersistentní položka]")
  public List<Paymentreminderrow> getRows() {
    return rows;
  }

  public void setRows(List<Paymentreminderrow> rows) {
    this.rows = rows;
  }

  public Paymentreminder docqueueId(String docqueueId) {
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

  public Paymentreminder periodId(String periodId) {
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

  public Paymentreminder ordnumber(Integer ordnumber) {
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

  public Paymentreminder docdatedate(DateTime docdatedate) {
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

  public Paymentreminder createdbyId(String createdbyId) {
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

  public Paymentreminder correctedbyId(String correctedbyId) {
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

  public Paymentreminder newrelatedtype(Integer newrelatedtype) {
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

  public Paymentreminder newrelateddocumentId(String newrelateddocumentId) {
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

  public Paymentreminder firmId(String firmId) {
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

  public Paymentreminder firmofficeId(String firmofficeId) {
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

  public Paymentreminder personId(String personId) {
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

  public Paymentreminder description(String description) {
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

  public Paymentreminder accountingtype(Integer accountingtype) {
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

  public Paymentreminder isaccounted(Boolean isaccounted) {
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

  public Paymentreminder dirty(Boolean dirty) {
    this.dirty = dirty;
    return this;
  }

   /**
   * zakázané přepočítání
   * @return dirty
  **/
  @ApiModelProperty(example = "null", value = "zakázané přepočítání")
  public Boolean getDirty() {
    return dirty;
  }

  public void setDirty(Boolean dirty) {
    this.dirty = dirty;
  }

  public Paymentreminder countryId(String countryId) {
    this.countryId = countryId;
    return this;
  }

   /**
   * země; id objektu země [persistentní položka]
   * @return countryId
  **/
  @ApiModelProperty(example = "null", value = "země; id objektu země [persistentní položka]")
  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  public Paymentreminder currencyId(String currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * měna; id objektu měna [persistentní položka]
   * @return currencyId
  **/
  @ApiModelProperty(example = "null", value = "měna; id objektu měna [persistentní položka]")
  public String getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }

  public Paymentreminder currrate(Double currrate) {
    this.currrate = currrate;
    return this;
  }

   /**
   * kurz měny [persistentní položka]
   * @return currrate
  **/
  @ApiModelProperty(example = "null", value = "kurz měny [persistentní položka]")
  public Double getCurrrate() {
    return currrate;
  }

  public void setCurrrate(Double currrate) {
    this.currrate = currrate;
  }

  public Paymentreminder refcurrrate(Double refcurrrate) {
    this.refcurrrate = refcurrrate;
    return this;
  }

   /**
   * kurz vztažný [persistentní položka]
   * @return refcurrrate
  **/
  @ApiModelProperty(example = "null", value = "kurz vztažný [persistentní položka]")
  public Double getRefcurrrate() {
    return refcurrrate;
  }

  public void setRefcurrrate(Double refcurrrate) {
    this.refcurrrate = refcurrrate;
  }

  public Paymentreminder coef(Integer coef) {
    this.coef = coef;
    return this;
  }

   /**
   * koeficient [persistentní položka]
   * @return coef
  **/
  @ApiModelProperty(example = "null", value = "koeficient [persistentní položka]")
  public Integer getCoef() {
    return coef;
  }

  public void setCoef(Integer coef) {
    this.coef = coef;
  }

  public Paymentreminder localcoef(Integer localcoef) {
    this.localcoef = localcoef;
    return this;
  }

   /**
   * lokální koeficient [persistentní položka]
   * @return localcoef
  **/
  @ApiModelProperty(example = "null", value = "lokální koeficient [persistentní položka]")
  public Integer getLocalcoef() {
    return localcoef;
  }

  public void setLocalcoef(Integer localcoef) {
    this.localcoef = localcoef;
  }

  public Paymentreminder zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * zóna; id objektu měna [persistentní položka]
   * @return zoneId
  **/
  @ApiModelProperty(example = "null", value = "zóna; id objektu měna [persistentní položka]")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }

  public Paymentreminder localzoneId(String localzoneId) {
    this.localzoneId = localzoneId;
    return this;
  }

   /**
   * lokální zóna; id objektu měna [persistentní položka]
   * @return localzoneId
  **/
  @ApiModelProperty(example = "null", value = "lokální zóna; id objektu měna [persistentní položka]")
  public String getLocalzoneId() {
    return localzoneId;
  }

  public void setLocalzoneId(String localzoneId) {
    this.localzoneId = localzoneId;
  }

  public Paymentreminder refcurrencyId(String refcurrencyId) {
    this.refcurrencyId = refcurrencyId;
    return this;
  }

   /**
   * ref.měna; id objektu měna
   * @return refcurrencyId
  **/
  @ApiModelProperty(example = "null", value = "ref.měna; id objektu měna")
  public String getRefcurrencyId() {
    return refcurrencyId;
  }

  public void setRefcurrencyId(String refcurrencyId) {
    this.refcurrencyId = refcurrencyId;
  }

  public Paymentreminder localrefcurrencyId(String localrefcurrencyId) {
    this.localrefcurrencyId = localrefcurrencyId;
    return this;
  }

   /**
   * lok.ref.měna; id objektu měna
   * @return localrefcurrencyId
  **/
  @ApiModelProperty(example = "null", value = "lok.ref.měna; id objektu měna")
  public String getLocalrefcurrencyId() {
    return localrefcurrencyId;
  }

  public void setLocalrefcurrencyId(String localrefcurrencyId) {
    this.localrefcurrencyId = localrefcurrencyId;
  }

  public Paymentreminder currrateinfo(String currrateinfo) {
    this.currrateinfo = currrateinfo;
    return this;
  }

   /**
   * kurz měny textově
   * @return currrateinfo
  **/
  @ApiModelProperty(example = "null", value = "kurz měny textově")
  public String getCurrrateinfo() {
    return currrateinfo;
  }

  public void setCurrrateinfo(String currrateinfo) {
    this.currrateinfo = currrateinfo;
  }

  public Paymentreminder amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * celkem [persistentní položka]
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "celkem [persistentní položka]")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Paymentreminder localamount(Double localamount) {
    this.localamount = localamount;
    return this;
  }

   /**
   * celkem lokálně [persistentní položka]
   * @return localamount
  **/
  @ApiModelProperty(example = "null", value = "celkem lokálně [persistentní položka]")
  public Double getLocalamount() {
    return localamount;
  }

  public void setLocalamount(Double localamount) {
    this.localamount = localamount;
  }

  public Paymentreminder addressId(String addressId) {
    this.addressId = addressId;
    return this;
  }

   /**
   * vlastní adresa; id objektu adresa [persistentní položka]
   * @return addressId
  **/
  @ApiModelProperty(example = "null", value = "vlastní adresa; id objektu adresa [persistentní položka]")
  public String getAddressId() {
    return addressId;
  }

  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }

  public Paymentreminder totalrounding(Integer totalrounding) {
    this.totalrounding = totalrounding;
    return this;
  }

   /**
   * zaokrouhlení celkové [persistentní položka]
   * @return totalrounding
  **/
  @ApiModelProperty(example = "null", value = "zaokrouhlení celkové [persistentní položka]")
  public Integer getTotalrounding() {
    return totalrounding;
  }

  public void setTotalrounding(Integer totalrounding) {
    this.totalrounding = totalrounding;
  }

  public Paymentreminder roundingamount(Double roundingamount) {
    this.roundingamount = roundingamount;
    return this;
  }

   /**
   * hal. [persistentní položka]
   * @return roundingamount
  **/
  @ApiModelProperty(example = "null", value = "hal. [persistentní položka]")
  public Double getRoundingamount() {
    return roundingamount;
  }

  public void setRoundingamount(Double roundingamount) {
    this.roundingamount = roundingamount;
  }

  public Paymentreminder localroundingamount(Double localroundingamount) {
    this.localroundingamount = localroundingamount;
    return this;
  }

   /**
   * hal.vyr.lok. [persistentní položka]
   * @return localroundingamount
  **/
  @ApiModelProperty(example = "null", value = "hal.vyr.lok. [persistentní položka]")
  public Double getLocalroundingamount() {
    return localroundingamount;
  }

  public void setLocalroundingamount(Double localroundingamount) {
    this.localroundingamount = localroundingamount;
  }

  public Paymentreminder penaltypercent(Double penaltypercent) {
    this.penaltypercent = penaltypercent;
    return this;
  }

   /**
   * Úrok z prodlení [%] [persistentní položka]
   * @return penaltypercent
  **/
  @ApiModelProperty(example = "null", value = "Úrok z prodlení [%] [persistentní položka]")
  public Double getPenaltypercent() {
    return penaltypercent;
  }

  public void setPenaltypercent(Double penaltypercent) {
    this.penaltypercent = penaltypercent;
  }

  public Paymentreminder docorder(Integer docorder) {
    this.docorder = docorder;
    return this;
  }

   /**
   * pořadové číslo dokl. k fak. [persistentní položka]
   * @return docorder
  **/
  @ApiModelProperty(example = "null", value = "pořadové číslo dokl. k fak. [persistentní položka]")
  public Integer getDocorder() {
    return docorder;
  }

  public void setDocorder(Integer docorder) {
    this.docorder = docorder;
  }

  public Paymentreminder calculating(Boolean calculating) {
    this.calculating = calculating;
    return this;
  }

   /**
   * probíhá přepočet
   * @return calculating
  **/
  @ApiModelProperty(example = "null", value = "probíhá přepočet")
  public Boolean getCalculating() {
    return calculating;
  }

  public void setCalculating(Boolean calculating) {
    this.calculating = calculating;
  }

  public Paymentreminder ispenaltyfromratetable(Boolean ispenaltyfromratetable) {
    this.ispenaltyfromratetable = ispenaltyfromratetable;
    return this;
  }

   /**
   * Úrok z prodlení na řádku [persistentní položka]
   * @return ispenaltyfromratetable
  **/
  @ApiModelProperty(example = "null", value = "Úrok z prodlení na řádku [persistentní položka]")
  public Boolean getIspenaltyfromratetable() {
    return ispenaltyfromratetable;
  }

  public void setIspenaltyfromratetable(Boolean ispenaltyfromratetable) {
    this.ispenaltyfromratetable = ispenaltyfromratetable;
  }

  public Paymentreminder issuedinvoiceId(String issuedinvoiceId) {
    this.issuedinvoiceId = issuedinvoiceId;
    return this;
  }

   /**
   * sankční faktura; id objektu faktura vydaná [persistentní položka]
   * @return issuedinvoiceId
  **/
  @ApiModelProperty(example = "null", value = "sankční faktura; id objektu faktura vydaná [persistentní položka]")
  public String getIssuedinvoiceId() {
    return issuedinvoiceId;
  }

  public void setIssuedinvoiceId(String issuedinvoiceId) {
    this.issuedinvoiceId = issuedinvoiceId;
  }

  public Paymentreminder lastpenaltyinvoice(String lastpenaltyinvoice) {
    this.lastpenaltyinvoice = lastpenaltyinvoice;
    return this;
  }

   /**
   * poslední sankční faktura; id objektu sankční faktura
   * @return lastpenaltyinvoice
  **/
  @ApiModelProperty(example = "null", value = "poslední sankční faktura; id objektu sankční faktura")
  public String getLastpenaltyinvoice() {
    return lastpenaltyinvoice;
  }

  public void setLastpenaltyinvoice(String lastpenaltyinvoice) {
    this.lastpenaltyinvoice = lastpenaltyinvoice;
  }

  public Paymentreminder createdatdate(DateTime createdatdate) {
    this.createdatdate = createdatdate;
    return this;
  }

   /**
   * vytvořeno [persistentní položka]
   * @return createdatdate
  **/
  @ApiModelProperty(example = "null", value = "vytvořeno [persistentní položka]")
  public DateTime getCreatedatdate() {
    return createdatdate;
  }

  public void setCreatedatdate(DateTime createdatdate) {
    this.createdatdate = createdatdate;
  }

  public Paymentreminder correctedatdate(DateTime correctedatdate) {
    this.correctedatdate = correctedatdate;
    return this;
  }

   /**
   * opraveno [persistentní položka]
   * @return correctedatdate
  **/
  @ApiModelProperty(example = "null", value = "opraveno [persistentní položka]")
  public DateTime getCorrectedatdate() {
    return correctedatdate;
  }

  public void setCorrectedatdate(DateTime correctedatdate) {
    this.correctedatdate = correctedatdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paymentreminder paymentreminder = (Paymentreminder) o;
    return Objects.equals(this.displayname, paymentreminder.displayname) &&
        Objects.equals(this.id, paymentreminder.id) &&
        Objects.equals(this.classid, paymentreminder.classid) &&
        Objects.equals(this.objversion, paymentreminder.objversion) &&
        Objects.equals(this.rows, paymentreminder.rows) &&
        Objects.equals(this.docqueueId, paymentreminder.docqueueId) &&
        Objects.equals(this.periodId, paymentreminder.periodId) &&
        Objects.equals(this.ordnumber, paymentreminder.ordnumber) &&
        Objects.equals(this.docdatedate, paymentreminder.docdatedate) &&
        Objects.equals(this.createdbyId, paymentreminder.createdbyId) &&
        Objects.equals(this.correctedbyId, paymentreminder.correctedbyId) &&
        Objects.equals(this.newrelatedtype, paymentreminder.newrelatedtype) &&
        Objects.equals(this.newrelateddocumentId, paymentreminder.newrelateddocumentId) &&
        Objects.equals(this.firmId, paymentreminder.firmId) &&
        Objects.equals(this.firmofficeId, paymentreminder.firmofficeId) &&
        Objects.equals(this.personId, paymentreminder.personId) &&
        Objects.equals(this.description, paymentreminder.description) &&
        Objects.equals(this.accountingtype, paymentreminder.accountingtype) &&
        Objects.equals(this.isaccounted, paymentreminder.isaccounted) &&
        Objects.equals(this.dirty, paymentreminder.dirty) &&
        Objects.equals(this.countryId, paymentreminder.countryId) &&
        Objects.equals(this.currencyId, paymentreminder.currencyId) &&
        Objects.equals(this.currrate, paymentreminder.currrate) &&
        Objects.equals(this.refcurrrate, paymentreminder.refcurrrate) &&
        Objects.equals(this.coef, paymentreminder.coef) &&
        Objects.equals(this.localcoef, paymentreminder.localcoef) &&
        Objects.equals(this.zoneId, paymentreminder.zoneId) &&
        Objects.equals(this.localzoneId, paymentreminder.localzoneId) &&
        Objects.equals(this.refcurrencyId, paymentreminder.refcurrencyId) &&
        Objects.equals(this.localrefcurrencyId, paymentreminder.localrefcurrencyId) &&
        Objects.equals(this.currrateinfo, paymentreminder.currrateinfo) &&
        Objects.equals(this.amount, paymentreminder.amount) &&
        Objects.equals(this.localamount, paymentreminder.localamount) &&
        Objects.equals(this.addressId, paymentreminder.addressId) &&
        Objects.equals(this.totalrounding, paymentreminder.totalrounding) &&
        Objects.equals(this.roundingamount, paymentreminder.roundingamount) &&
        Objects.equals(this.localroundingamount, paymentreminder.localroundingamount) &&
        Objects.equals(this.penaltypercent, paymentreminder.penaltypercent) &&
        Objects.equals(this.docorder, paymentreminder.docorder) &&
        Objects.equals(this.calculating, paymentreminder.calculating) &&
        Objects.equals(this.ispenaltyfromratetable, paymentreminder.ispenaltyfromratetable) &&
        Objects.equals(this.issuedinvoiceId, paymentreminder.issuedinvoiceId) &&
        Objects.equals(this.lastpenaltyinvoice, paymentreminder.lastpenaltyinvoice) &&
        Objects.equals(this.createdatdate, paymentreminder.createdatdate) &&
        Objects.equals(this.correctedatdate, paymentreminder.correctedatdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, docqueueId, periodId, ordnumber, docdatedate, createdbyId, correctedbyId, newrelatedtype, newrelateddocumentId, firmId, firmofficeId, personId, description, accountingtype, isaccounted, dirty, countryId, currencyId, currrate, refcurrrate, coef, localcoef, zoneId, localzoneId, refcurrencyId, localrefcurrencyId, currrateinfo, amount, localamount, addressId, totalrounding, roundingamount, localroundingamount, penaltypercent, docorder, calculating, ispenaltyfromratetable, issuedinvoiceId, lastpenaltyinvoice, createdatdate, correctedatdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paymentreminder {\n");
    
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
    sb.append("    firmId: ").append(toIndentedString(firmId)).append("\n");
    sb.append("    firmofficeId: ").append(toIndentedString(firmofficeId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accountingtype: ").append(toIndentedString(accountingtype)).append("\n");
    sb.append("    isaccounted: ").append(toIndentedString(isaccounted)).append("\n");
    sb.append("    dirty: ").append(toIndentedString(dirty)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    currrate: ").append(toIndentedString(currrate)).append("\n");
    sb.append("    refcurrrate: ").append(toIndentedString(refcurrrate)).append("\n");
    sb.append("    coef: ").append(toIndentedString(coef)).append("\n");
    sb.append("    localcoef: ").append(toIndentedString(localcoef)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    localzoneId: ").append(toIndentedString(localzoneId)).append("\n");
    sb.append("    refcurrencyId: ").append(toIndentedString(refcurrencyId)).append("\n");
    sb.append("    localrefcurrencyId: ").append(toIndentedString(localrefcurrencyId)).append("\n");
    sb.append("    currrateinfo: ").append(toIndentedString(currrateinfo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    localamount: ").append(toIndentedString(localamount)).append("\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    totalrounding: ").append(toIndentedString(totalrounding)).append("\n");
    sb.append("    roundingamount: ").append(toIndentedString(roundingamount)).append("\n");
    sb.append("    localroundingamount: ").append(toIndentedString(localroundingamount)).append("\n");
    sb.append("    penaltypercent: ").append(toIndentedString(penaltypercent)).append("\n");
    sb.append("    docorder: ").append(toIndentedString(docorder)).append("\n");
    sb.append("    calculating: ").append(toIndentedString(calculating)).append("\n");
    sb.append("    ispenaltyfromratetable: ").append(toIndentedString(ispenaltyfromratetable)).append("\n");
    sb.append("    issuedinvoiceId: ").append(toIndentedString(issuedinvoiceId)).append("\n");
    sb.append("    lastpenaltyinvoice: ").append(toIndentedString(lastpenaltyinvoice)).append("\n");
    sb.append("    createdatdate: ").append(toIndentedString(createdatdate)).append("\n");
    sb.append("    correctedatdate: ").append(toIndentedString(correctedatdate)).append("\n");
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
