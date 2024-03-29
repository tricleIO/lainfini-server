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

import java.util.Objects;


/**
 * Wagepaymentorderssources
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Wagepaymentorderssources   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

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

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("paidamount")
  private Double paidamount = null;

  @SerializedName("duedate$date")
  private DateTime duedatedate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("bankaccount_id")
  private String bankaccountId = null;

  @SerializedName("targetbankaccount")
  private String targetbankaccount = null;

  @SerializedName("targetbankname")
  private String targetbankname = null;

  @SerializedName("varsymbol")
  private String varsymbol = null;

  @SerializedName("constsymbol_id")
  private String constsymbolId = null;

  @SerializedName("specsymbol")
  private String specsymbol = null;

  @SerializedName("currency_id")
  private String currencyId = null;

  @SerializedName("country_id")
  private String countryId = null;

  @SerializedName("targetbankcountry_id")
  private String targetbankcountryId = null;

  @SerializedName("foreignissue")
  private Integer foreignissue = null;

  @SerializedName("urgent")
  private Integer urgent = null;

  @SerializedName("swiftcode")
  private String swiftcode = null;

  @SerializedName("paymentorder_id")
  private String paymentorderId = null;

  @SerializedName("paymentorder_idisvalid")
  private Boolean paymentorderIdisvalid = null;

  @SerializedName("firm_id")
  private String firmId = null;

  @SerializedName("wageclosingbook_id")
  private String wageclosingbookId = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("basetype")
  private Integer basetype = null;

  @SerializedName("flag")
  private String flag = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  @SerializedName("isprofit")
  private Boolean isprofit = null;

  public Wagepaymentorderssources displayname(String displayname) {
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

  public Wagepaymentorderssources id(String id) {
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

  public Wagepaymentorderssources classid(String classid) {
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

  public Wagepaymentorderssources objversion(Integer objversion) {
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

  public Wagepaymentorderssources docqueueId(String docqueueId) {
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

  public Wagepaymentorderssources periodId(String periodId) {
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

  public Wagepaymentorderssources ordnumber(Integer ordnumber) {
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

  public Wagepaymentorderssources docdatedate(DateTime docdatedate) {
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

  public Wagepaymentorderssources createdbyId(String createdbyId) {
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

  public Wagepaymentorderssources correctedbyId(String correctedbyId) {
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

  public Wagepaymentorderssources newrelatedtype(Integer newrelatedtype) {
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

  public Wagepaymentorderssources newrelateddocumentId(String newrelateddocumentId) {
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

  public Wagepaymentorderssources amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Částka [persistentní položka]
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "Částka [persistentní položka]")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Wagepaymentorderssources paidamount(Double paidamount) {
    this.paidamount = paidamount;
    return this;
  }

   /**
   * zapl. částka [persistentní položka]
   * @return paidamount
  **/
  @ApiModelProperty(example = "null", value = "zapl. částka [persistentní položka]")
  public Double getPaidamount() {
    return paidamount;
  }

  public void setPaidamount(Double paidamount) {
    this.paidamount = paidamount;
  }

  public Wagepaymentorderssources duedatedate(DateTime duedatedate) {
    this.duedatedate = duedatedate;
    return this;
  }

   /**
   * datum splatnosti [persistentní položka]
   * @return duedatedate
  **/
  @ApiModelProperty(example = "null", value = "datum splatnosti [persistentní položka]")
  public DateTime getDuedatedate() {
    return duedatedate;
  }

  public void setDuedatedate(DateTime duedatedate) {
    this.duedatedate = duedatedate;
  }

  public Wagepaymentorderssources description(String description) {
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

  public Wagepaymentorderssources bankaccountId(String bankaccountId) {
    this.bankaccountId = bankaccountId;
    return this;
  }

   /**
   * zdrojový bank.ú.; id objektu bankovní účet [persistentní položka]
   * @return bankaccountId
  **/
  @ApiModelProperty(example = "null", value = "zdrojový bank.ú.; id objektu bankovní účet [persistentní položka]")
  public String getBankaccountId() {
    return bankaccountId;
  }

  public void setBankaccountId(String bankaccountId) {
    this.bankaccountId = bankaccountId;
  }

  public Wagepaymentorderssources targetbankaccount(String targetbankaccount) {
    this.targetbankaccount = targetbankaccount;
    return this;
  }

   /**
   * cílový bank.ú. [persistentní položka]
   * @return targetbankaccount
  **/
  @ApiModelProperty(example = "null", value = "cílový bank.ú. [persistentní položka]")
  public String getTargetbankaccount() {
    return targetbankaccount;
  }

  public void setTargetbankaccount(String targetbankaccount) {
    this.targetbankaccount = targetbankaccount;
  }

  public Wagepaymentorderssources targetbankname(String targetbankname) {
    this.targetbankname = targetbankname;
    return this;
  }

   /**
   * cílová banka [persistentní položka]
   * @return targetbankname
  **/
  @ApiModelProperty(example = "null", value = "cílová banka [persistentní položka]")
  public String getTargetbankname() {
    return targetbankname;
  }

  public void setTargetbankname(String targetbankname) {
    this.targetbankname = targetbankname;
  }

  public Wagepaymentorderssources varsymbol(String varsymbol) {
    this.varsymbol = varsymbol;
    return this;
  }

   /**
   * var.symbol [persistentní položka]
   * @return varsymbol
  **/
  @ApiModelProperty(example = "null", value = "var.symbol [persistentní položka]")
  public String getVarsymbol() {
    return varsymbol;
  }

  public void setVarsymbol(String varsymbol) {
    this.varsymbol = varsymbol;
  }

  public Wagepaymentorderssources constsymbolId(String constsymbolId) {
    this.constsymbolId = constsymbolId;
    return this;
  }

   /**
   * konst.symb.; id objektu konstantní symbol [persistentní položka]
   * @return constsymbolId
  **/
  @ApiModelProperty(example = "null", value = "konst.symb.; id objektu konstantní symbol [persistentní položka]")
  public String getConstsymbolId() {
    return constsymbolId;
  }

  public void setConstsymbolId(String constsymbolId) {
    this.constsymbolId = constsymbolId;
  }

  public Wagepaymentorderssources specsymbol(String specsymbol) {
    this.specsymbol = specsymbol;
    return this;
  }

   /**
   * spec.symbol [persistentní položka]
   * @return specsymbol
  **/
  @ApiModelProperty(example = "null", value = "spec.symbol [persistentní položka]")
  public String getSpecsymbol() {
    return specsymbol;
  }

  public void setSpecsymbol(String specsymbol) {
    this.specsymbol = specsymbol;
  }

  public Wagepaymentorderssources currencyId(String currencyId) {
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

  public Wagepaymentorderssources countryId(String countryId) {
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

  public Wagepaymentorderssources targetbankcountryId(String targetbankcountryId) {
    this.targetbankcountryId = targetbankcountryId;
    return this;
  }

   /**
   * země banky; id objektu země [persistentní položka]
   * @return targetbankcountryId
  **/
  @ApiModelProperty(example = "null", value = "země banky; id objektu země [persistentní položka]")
  public String getTargetbankcountryId() {
    return targetbankcountryId;
  }

  public void setTargetbankcountryId(String targetbankcountryId) {
    this.targetbankcountryId = targetbankcountryId;
  }

  public Wagepaymentorderssources foreignissue(Integer foreignissue) {
    this.foreignissue = foreignissue;
    return this;
  }

   /**
   * dodatečné popl. [persistentní položka]
   * @return foreignissue
  **/
  @ApiModelProperty(example = "null", value = "dodatečné popl. [persistentní položka]")
  public Integer getForeignissue() {
    return foreignissue;
  }

  public void setForeignissue(Integer foreignissue) {
    this.foreignissue = foreignissue;
  }

  public Wagepaymentorderssources urgent(Integer urgent) {
    this.urgent = urgent;
    return this;
  }

   /**
   * způsob provedení pl. [persistentní položka]
   * @return urgent
  **/
  @ApiModelProperty(example = "null", value = "způsob provedení pl. [persistentní položka]")
  public Integer getUrgent() {
    return urgent;
  }

  public void setUrgent(Integer urgent) {
    this.urgent = urgent;
  }

  public Wagepaymentorderssources swiftcode(String swiftcode) {
    this.swiftcode = swiftcode;
    return this;
  }

   /**
   * swift kód [persistentní položka]
   * @return swiftcode
  **/
  @ApiModelProperty(example = "null", value = "swift kód [persistentní položka]")
  public String getSwiftcode() {
    return swiftcode;
  }

  public void setSwiftcode(String swiftcode) {
    this.swiftcode = swiftcode;
  }

  public Wagepaymentorderssources paymentorderId(String paymentorderId) {
    this.paymentorderId = paymentorderId;
    return this;
  }

   /**
   * plat.příkaz; id objektu platební příkaz - řádek
   * @return paymentorderId
  **/
  @ApiModelProperty(example = "null", value = "plat.příkaz; id objektu platební příkaz - řádek")
  public String getPaymentorderId() {
    return paymentorderId;
  }

  public void setPaymentorderId(String paymentorderId) {
    this.paymentorderId = paymentorderId;
  }

  public Wagepaymentorderssources paymentorderIdisvalid(Boolean paymentorderIdisvalid) {
    this.paymentorderIdisvalid = paymentorderIdisvalid;
    return this;
  }

   /**
   * platný odkaz na plat.příkaz
   * @return paymentorderIdisvalid
  **/
  @ApiModelProperty(example = "null", value = "platný odkaz na plat.příkaz")
  public Boolean getPaymentorderIdisvalid() {
    return paymentorderIdisvalid;
  }

  public void setPaymentorderIdisvalid(Boolean paymentorderIdisvalid) {
    this.paymentorderIdisvalid = paymentorderIdisvalid;
  }

  public Wagepaymentorderssources firmId(String firmId) {
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

  public Wagepaymentorderssources wageclosingbookId(String wageclosingbookId) {
    this.wageclosingbookId = wageclosingbookId;
    return this;
  }

   /**
   * mzdová uzávěrka; id objektu uzávěrka mezd [persistentní položka]
   * @return wageclosingbookId
  **/
  @ApiModelProperty(example = "null", value = "mzdová uzávěrka; id objektu uzávěrka mezd [persistentní položka]")
  public String getWageclosingbookId() {
    return wageclosingbookId;
  }

  public void setWageclosingbookId(String wageclosingbookId) {
    this.wageclosingbookId = wageclosingbookId;
  }

  public Wagepaymentorderssources divisionId(String divisionId) {
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

  public Wagepaymentorderssources busorderId(String busorderId) {
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

  public Wagepaymentorderssources bustransactionId(String bustransactionId) {
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

  public Wagepaymentorderssources basetype(Integer basetype) {
    this.basetype = basetype;
    return this;
  }

   /**
   * zákl. druh [persistentní položka]
   * @return basetype
  **/
  @ApiModelProperty(example = "null", value = "zákl. druh [persistentní položka]")
  public Integer getBasetype() {
    return basetype;
  }

  public void setBasetype(Integer basetype) {
    this.basetype = basetype;
  }

  public Wagepaymentorderssources flag(String flag) {
    this.flag = flag;
    return this;
  }

   /**
   * rozl. řetězec [persistentní položka]
   * @return flag
  **/
  @ApiModelProperty(example = "null", value = "rozl. řetězec [persistentní položka]")
  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  public Wagepaymentorderssources busprojectId(String busprojectId) {
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

  public Wagepaymentorderssources isprofit(Boolean isprofit) {
    this.isprofit = isprofit;
    return this;
  }

   /**
   * výnos
   * @return isprofit
  **/
  @ApiModelProperty(example = "null", value = "výnos")
  public Boolean getIsprofit() {
    return isprofit;
  }

  public void setIsprofit(Boolean isprofit) {
    this.isprofit = isprofit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wagepaymentorderssources wagepaymentorderssources = (Wagepaymentorderssources) o;
    return Objects.equals(this.displayname, wagepaymentorderssources.displayname) &&
        Objects.equals(this.id, wagepaymentorderssources.id) &&
        Objects.equals(this.classid, wagepaymentorderssources.classid) &&
        Objects.equals(this.objversion, wagepaymentorderssources.objversion) &&
        Objects.equals(this.docqueueId, wagepaymentorderssources.docqueueId) &&
        Objects.equals(this.periodId, wagepaymentorderssources.periodId) &&
        Objects.equals(this.ordnumber, wagepaymentorderssources.ordnumber) &&
        Objects.equals(this.docdatedate, wagepaymentorderssources.docdatedate) &&
        Objects.equals(this.createdbyId, wagepaymentorderssources.createdbyId) &&
        Objects.equals(this.correctedbyId, wagepaymentorderssources.correctedbyId) &&
        Objects.equals(this.newrelatedtype, wagepaymentorderssources.newrelatedtype) &&
        Objects.equals(this.newrelateddocumentId, wagepaymentorderssources.newrelateddocumentId) &&
        Objects.equals(this.amount, wagepaymentorderssources.amount) &&
        Objects.equals(this.paidamount, wagepaymentorderssources.paidamount) &&
        Objects.equals(this.duedatedate, wagepaymentorderssources.duedatedate) &&
        Objects.equals(this.description, wagepaymentorderssources.description) &&
        Objects.equals(this.bankaccountId, wagepaymentorderssources.bankaccountId) &&
        Objects.equals(this.targetbankaccount, wagepaymentorderssources.targetbankaccount) &&
        Objects.equals(this.targetbankname, wagepaymentorderssources.targetbankname) &&
        Objects.equals(this.varsymbol, wagepaymentorderssources.varsymbol) &&
        Objects.equals(this.constsymbolId, wagepaymentorderssources.constsymbolId) &&
        Objects.equals(this.specsymbol, wagepaymentorderssources.specsymbol) &&
        Objects.equals(this.currencyId, wagepaymentorderssources.currencyId) &&
        Objects.equals(this.countryId, wagepaymentorderssources.countryId) &&
        Objects.equals(this.targetbankcountryId, wagepaymentorderssources.targetbankcountryId) &&
        Objects.equals(this.foreignissue, wagepaymentorderssources.foreignissue) &&
        Objects.equals(this.urgent, wagepaymentorderssources.urgent) &&
        Objects.equals(this.swiftcode, wagepaymentorderssources.swiftcode) &&
        Objects.equals(this.paymentorderId, wagepaymentorderssources.paymentorderId) &&
        Objects.equals(this.paymentorderIdisvalid, wagepaymentorderssources.paymentorderIdisvalid) &&
        Objects.equals(this.firmId, wagepaymentorderssources.firmId) &&
        Objects.equals(this.wageclosingbookId, wagepaymentorderssources.wageclosingbookId) &&
        Objects.equals(this.divisionId, wagepaymentorderssources.divisionId) &&
        Objects.equals(this.busorderId, wagepaymentorderssources.busorderId) &&
        Objects.equals(this.bustransactionId, wagepaymentorderssources.bustransactionId) &&
        Objects.equals(this.basetype, wagepaymentorderssources.basetype) &&
        Objects.equals(this.flag, wagepaymentorderssources.flag) &&
        Objects.equals(this.busprojectId, wagepaymentorderssources.busprojectId) &&
        Objects.equals(this.isprofit, wagepaymentorderssources.isprofit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, docqueueId, periodId, ordnumber, docdatedate, createdbyId, correctedbyId, newrelatedtype, newrelateddocumentId, amount, paidamount, duedatedate, description, bankaccountId, targetbankaccount, targetbankname, varsymbol, constsymbolId, specsymbol, currencyId, countryId, targetbankcountryId, foreignissue, urgent, swiftcode, paymentorderId, paymentorderIdisvalid, firmId, wageclosingbookId, divisionId, busorderId, bustransactionId, basetype, flag, busprojectId, isprofit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wagepaymentorderssources {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    docqueueId: ").append(toIndentedString(docqueueId)).append("\n");
    sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
    sb.append("    ordnumber: ").append(toIndentedString(ordnumber)).append("\n");
    sb.append("    docdatedate: ").append(toIndentedString(docdatedate)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    newrelatedtype: ").append(toIndentedString(newrelatedtype)).append("\n");
    sb.append("    newrelateddocumentId: ").append(toIndentedString(newrelateddocumentId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    paidamount: ").append(toIndentedString(paidamount)).append("\n");
    sb.append("    duedatedate: ").append(toIndentedString(duedatedate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    bankaccountId: ").append(toIndentedString(bankaccountId)).append("\n");
    sb.append("    targetbankaccount: ").append(toIndentedString(targetbankaccount)).append("\n");
    sb.append("    targetbankname: ").append(toIndentedString(targetbankname)).append("\n");
    sb.append("    varsymbol: ").append(toIndentedString(varsymbol)).append("\n");
    sb.append("    constsymbolId: ").append(toIndentedString(constsymbolId)).append("\n");
    sb.append("    specsymbol: ").append(toIndentedString(specsymbol)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    targetbankcountryId: ").append(toIndentedString(targetbankcountryId)).append("\n");
    sb.append("    foreignissue: ").append(toIndentedString(foreignissue)).append("\n");
    sb.append("    urgent: ").append(toIndentedString(urgent)).append("\n");
    sb.append("    swiftcode: ").append(toIndentedString(swiftcode)).append("\n");
    sb.append("    paymentorderId: ").append(toIndentedString(paymentorderId)).append("\n");
    sb.append("    paymentorderIdisvalid: ").append(toIndentedString(paymentorderIdisvalid)).append("\n");
    sb.append("    firmId: ").append(toIndentedString(firmId)).append("\n");
    sb.append("    wageclosingbookId: ").append(toIndentedString(wageclosingbookId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    busorderId: ").append(toIndentedString(busorderId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    basetype: ").append(toIndentedString(basetype)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    busprojectId: ").append(toIndentedString(busprojectId)).append("\n");
    sb.append("    isprofit: ").append(toIndentedString(isprofit)).append("\n");
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

