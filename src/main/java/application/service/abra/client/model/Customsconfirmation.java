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
 * Customsconfirmation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Customsconfirmation   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Customsconfirmationrow> rows = new ArrayList<Customsconfirmationrow>();

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

  @SerializedName("vatdocument")
  private Boolean vatdocument = null;

  @SerializedName("amountwithoutvat")
  private Double amountwithoutvat = null;

  @SerializedName("localamountwithoutvat")
  private Double localamountwithoutvat = null;

  @SerializedName("vatdate$date")
  private DateTime vatdatedate = null;

  @SerializedName("vatamount")
  private Double vatamount = null;

  @SerializedName("localvatamount")
  private Double localvatamount = null;

  @SerializedName("isaccountedlatervat")
  private Boolean isaccountedlatervat = null;

  @SerializedName("vatreportpreference")
  private String vatreportpreference = null;

  @SerializedName("externalnumber")
  private String externalnumber = null;

  @SerializedName("createdat$date")
  private DateTime createdatdate = null;

  @SerializedName("correctedat$date")
  private DateTime correctedatdate = null;

  public Customsconfirmation displayname(String displayname) {
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

  public Customsconfirmation id(String id) {
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

  public Customsconfirmation classid(String classid) {
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

  public Customsconfirmation objversion(Integer objversion) {
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

  public Customsconfirmation rows(List<Customsconfirmationrow> rows) {
    this.rows = rows;
    return this;
  }

  public Customsconfirmation addRowsItem(Customsconfirmationrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo Řádek potvrzení celnice o vývozu [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo Řádek potvrzení celnice o vývozu [nepersistentní položka]")
  public List<Customsconfirmationrow> getRows() {
    return rows;
  }

  public void setRows(List<Customsconfirmationrow> rows) {
    this.rows = rows;
  }

  public Customsconfirmation docqueueId(String docqueueId) {
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

  public Customsconfirmation periodId(String periodId) {
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

  public Customsconfirmation ordnumber(Integer ordnumber) {
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

  public Customsconfirmation docdatedate(DateTime docdatedate) {
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

  public Customsconfirmation createdbyId(String createdbyId) {
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

  public Customsconfirmation correctedbyId(String correctedbyId) {
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

  public Customsconfirmation newrelatedtype(Integer newrelatedtype) {
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

  public Customsconfirmation newrelateddocumentId(String newrelateddocumentId) {
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

  public Customsconfirmation firmId(String firmId) {
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

  public Customsconfirmation firmofficeId(String firmofficeId) {
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

  public Customsconfirmation personId(String personId) {
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

  public Customsconfirmation description(String description) {
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

  public Customsconfirmation accountingtype(Integer accountingtype) {
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

  public Customsconfirmation isaccounted(Boolean isaccounted) {
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

  public Customsconfirmation dirty(Boolean dirty) {
    this.dirty = dirty;
    return this;
  }

   /**
   * zakázané přepočítání [persistentní položka]
   * @return dirty
  **/
  @ApiModelProperty(example = "null", value = "zakázané přepočítání [persistentní položka]")
  public Boolean getDirty() {
    return dirty;
  }

  public void setDirty(Boolean dirty) {
    this.dirty = dirty;
  }

  public Customsconfirmation countryId(String countryId) {
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

  public Customsconfirmation currencyId(String currencyId) {
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

  public Customsconfirmation currrate(Double currrate) {
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

  public Customsconfirmation refcurrrate(Double refcurrrate) {
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

  public Customsconfirmation coef(Integer coef) {
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

  public Customsconfirmation localcoef(Integer localcoef) {
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

  public Customsconfirmation zoneId(String zoneId) {
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

  public Customsconfirmation localzoneId(String localzoneId) {
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

  public Customsconfirmation refcurrencyId(String refcurrencyId) {
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

  public Customsconfirmation localrefcurrencyId(String localrefcurrencyId) {
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

  public Customsconfirmation currrateinfo(String currrateinfo) {
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

  public Customsconfirmation amount(Double amount) {
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

  public Customsconfirmation localamount(Double localamount) {
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

  public Customsconfirmation vatdocument(Boolean vatdocument) {
    this.vatdocument = vatdocument;
    return this;
  }

   /**
   * dph doklad [persistentní položka]
   * @return vatdocument
  **/
  @ApiModelProperty(example = "null", value = "dph doklad [persistentní položka]")
  public Boolean getVatdocument() {
    return vatdocument;
  }

  public void setVatdocument(Boolean vatdocument) {
    this.vatdocument = vatdocument;
  }

  public Customsconfirmation amountwithoutvat(Double amountwithoutvat) {
    this.amountwithoutvat = amountwithoutvat;
    return this;
  }

   /**
   * celkem bez [persistentní položka]
   * @return amountwithoutvat
  **/
  @ApiModelProperty(example = "null", value = "celkem bez [persistentní položka]")
  public Double getAmountwithoutvat() {
    return amountwithoutvat;
  }

  public void setAmountwithoutvat(Double amountwithoutvat) {
    this.amountwithoutvat = amountwithoutvat;
  }

  public Customsconfirmation localamountwithoutvat(Double localamountwithoutvat) {
    this.localamountwithoutvat = localamountwithoutvat;
    return this;
  }

   /**
   * celkem lokálně bez daně [persistentní položka]
   * @return localamountwithoutvat
  **/
  @ApiModelProperty(example = "null", value = "celkem lokálně bez daně [persistentní položka]")
  public Double getLocalamountwithoutvat() {
    return localamountwithoutvat;
  }

  public void setLocalamountwithoutvat(Double localamountwithoutvat) {
    this.localamountwithoutvat = localamountwithoutvat;
  }

  public Customsconfirmation vatdatedate(DateTime vatdatedate) {
    this.vatdatedate = vatdatedate;
    return this;
  }

   /**
   * datum pln. [persistentní položka]
   * @return vatdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum pln. [persistentní položka]")
  public DateTime getVatdatedate() {
    return vatdatedate;
  }

  public void setVatdatedate(DateTime vatdatedate) {
    this.vatdatedate = vatdatedate;
  }

  public Customsconfirmation vatamount(Double vatamount) {
    this.vatamount = vatamount;
    return this;
  }

   /**
   * dph
   * @return vatamount
  **/
  @ApiModelProperty(example = "null", value = "dph")
  public Double getVatamount() {
    return vatamount;
  }

  public void setVatamount(Double vatamount) {
    this.vatamount = vatamount;
  }

  public Customsconfirmation localvatamount(Double localvatamount) {
    this.localvatamount = localvatamount;
    return this;
  }

   /**
   * dph lok.
   * @return localvatamount
  **/
  @ApiModelProperty(example = "null", value = "dph lok.")
  public Double getLocalvatamount() {
    return localvatamount;
  }

  public void setLocalvatamount(Double localvatamount) {
    this.localvatamount = localvatamount;
  }

  public Customsconfirmation isaccountedlatervat(Boolean isaccountedlatervat) {
    this.isaccountedlatervat = isaccountedlatervat;
    return this;
  }

   /**
   * dph pozdější odpočet
   * @return isaccountedlatervat
  **/
  @ApiModelProperty(example = "null", value = "dph pozdější odpočet")
  public Boolean getIsaccountedlatervat() {
    return isaccountedlatervat;
  }

  public void setIsaccountedlatervat(Boolean isaccountedlatervat) {
    this.isaccountedlatervat = isaccountedlatervat;
  }

  public Customsconfirmation vatreportpreference(String vatreportpreference) {
    this.vatreportpreference = vatreportpreference;
    return this;
  }

   /**
   * preference výkazu dph [persistentní položka]
   * @return vatreportpreference
  **/
  @ApiModelProperty(example = "null", value = "preference výkazu dph [persistentní položka]")
  public String getVatreportpreference() {
    return vatreportpreference;
  }

  public void setVatreportpreference(String vatreportpreference) {
    this.vatreportpreference = vatreportpreference;
  }

  public Customsconfirmation externalnumber(String externalnumber) {
    this.externalnumber = externalnumber;
    return this;
  }

   /**
   * externí číslo [persistentní položka]
   * @return externalnumber
  **/
  @ApiModelProperty(example = "null", value = "externí číslo [persistentní položka]")
  public String getExternalnumber() {
    return externalnumber;
  }

  public void setExternalnumber(String externalnumber) {
    this.externalnumber = externalnumber;
  }

  public Customsconfirmation createdatdate(DateTime createdatdate) {
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

  public Customsconfirmation correctedatdate(DateTime correctedatdate) {
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
    Customsconfirmation customsconfirmation = (Customsconfirmation) o;
    return Objects.equals(this.displayname, customsconfirmation.displayname) &&
        Objects.equals(this.id, customsconfirmation.id) &&
        Objects.equals(this.classid, customsconfirmation.classid) &&
        Objects.equals(this.objversion, customsconfirmation.objversion) &&
        Objects.equals(this.rows, customsconfirmation.rows) &&
        Objects.equals(this.docqueueId, customsconfirmation.docqueueId) &&
        Objects.equals(this.periodId, customsconfirmation.periodId) &&
        Objects.equals(this.ordnumber, customsconfirmation.ordnumber) &&
        Objects.equals(this.docdatedate, customsconfirmation.docdatedate) &&
        Objects.equals(this.createdbyId, customsconfirmation.createdbyId) &&
        Objects.equals(this.correctedbyId, customsconfirmation.correctedbyId) &&
        Objects.equals(this.newrelatedtype, customsconfirmation.newrelatedtype) &&
        Objects.equals(this.newrelateddocumentId, customsconfirmation.newrelateddocumentId) &&
        Objects.equals(this.firmId, customsconfirmation.firmId) &&
        Objects.equals(this.firmofficeId, customsconfirmation.firmofficeId) &&
        Objects.equals(this.personId, customsconfirmation.personId) &&
        Objects.equals(this.description, customsconfirmation.description) &&
        Objects.equals(this.accountingtype, customsconfirmation.accountingtype) &&
        Objects.equals(this.isaccounted, customsconfirmation.isaccounted) &&
        Objects.equals(this.dirty, customsconfirmation.dirty) &&
        Objects.equals(this.countryId, customsconfirmation.countryId) &&
        Objects.equals(this.currencyId, customsconfirmation.currencyId) &&
        Objects.equals(this.currrate, customsconfirmation.currrate) &&
        Objects.equals(this.refcurrrate, customsconfirmation.refcurrrate) &&
        Objects.equals(this.coef, customsconfirmation.coef) &&
        Objects.equals(this.localcoef, customsconfirmation.localcoef) &&
        Objects.equals(this.zoneId, customsconfirmation.zoneId) &&
        Objects.equals(this.localzoneId, customsconfirmation.localzoneId) &&
        Objects.equals(this.refcurrencyId, customsconfirmation.refcurrencyId) &&
        Objects.equals(this.localrefcurrencyId, customsconfirmation.localrefcurrencyId) &&
        Objects.equals(this.currrateinfo, customsconfirmation.currrateinfo) &&
        Objects.equals(this.amount, customsconfirmation.amount) &&
        Objects.equals(this.localamount, customsconfirmation.localamount) &&
        Objects.equals(this.vatdocument, customsconfirmation.vatdocument) &&
        Objects.equals(this.amountwithoutvat, customsconfirmation.amountwithoutvat) &&
        Objects.equals(this.localamountwithoutvat, customsconfirmation.localamountwithoutvat) &&
        Objects.equals(this.vatdatedate, customsconfirmation.vatdatedate) &&
        Objects.equals(this.vatamount, customsconfirmation.vatamount) &&
        Objects.equals(this.localvatamount, customsconfirmation.localvatamount) &&
        Objects.equals(this.isaccountedlatervat, customsconfirmation.isaccountedlatervat) &&
        Objects.equals(this.vatreportpreference, customsconfirmation.vatreportpreference) &&
        Objects.equals(this.externalnumber, customsconfirmation.externalnumber) &&
        Objects.equals(this.createdatdate, customsconfirmation.createdatdate) &&
        Objects.equals(this.correctedatdate, customsconfirmation.correctedatdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, docqueueId, periodId, ordnumber, docdatedate, createdbyId, correctedbyId, newrelatedtype, newrelateddocumentId, firmId, firmofficeId, personId, description, accountingtype, isaccounted, dirty, countryId, currencyId, currrate, refcurrrate, coef, localcoef, zoneId, localzoneId, refcurrencyId, localrefcurrencyId, currrateinfo, amount, localamount, vatdocument, amountwithoutvat, localamountwithoutvat, vatdatedate, vatamount, localvatamount, isaccountedlatervat, vatreportpreference, externalnumber, createdatdate, correctedatdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customsconfirmation {\n");
    
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
    sb.append("    vatdocument: ").append(toIndentedString(vatdocument)).append("\n");
    sb.append("    amountwithoutvat: ").append(toIndentedString(amountwithoutvat)).append("\n");
    sb.append("    localamountwithoutvat: ").append(toIndentedString(localamountwithoutvat)).append("\n");
    sb.append("    vatdatedate: ").append(toIndentedString(vatdatedate)).append("\n");
    sb.append("    vatamount: ").append(toIndentedString(vatamount)).append("\n");
    sb.append("    localvatamount: ").append(toIndentedString(localvatamount)).append("\n");
    sb.append("    isaccountedlatervat: ").append(toIndentedString(isaccountedlatervat)).append("\n");
    sb.append("    vatreportpreference: ").append(toIndentedString(vatreportpreference)).append("\n");
    sb.append("    externalnumber: ").append(toIndentedString(externalnumber)).append("\n");
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

