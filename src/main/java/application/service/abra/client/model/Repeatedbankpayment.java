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
 * Repeatedbankpayment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Repeatedbankpayment   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("repetitioncount")
  private Integer repetitioncount = null;

  @SerializedName("repetitionkind")
  private Integer repetitionkind = null;

  @SerializedName("repeattodate$date")
  private DateTime repeattodatedate = null;

  @SerializedName("lastgendate$date")
  private DateTime lastgendatedate = null;

  @SerializedName("repetitionperiod")
  private Integer repetitionperiod = null;

  @SerializedName("repetitionday")
  private Integer repetitionday = null;

  @SerializedName("repetitionmonth")
  private Integer repetitionmonth = null;

  @SerializedName("weekendcorrection")
  private Integer weekendcorrection = null;

  @SerializedName("repetitiondaysinweek")
  private String repetitiondaysinweek = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("currency_id")
  private String currencyId = null;

  @SerializedName("country_id")
  private String countryId = null;

  @SerializedName("foreignissue")
  private Integer foreignissue = null;

  @SerializedName("urgent")
  private Integer urgent = null;

  @SerializedName("firm_id")
  private String firmId = null;

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

  @SerializedName("swiftcode")
  private String swiftcode = null;

  @SerializedName("bankaccount_id")
  private String bankaccountId = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("isactive")
  private Boolean isactive = null;

  @SerializedName("targetbankstreet")
  private String targetbankstreet = null;

  @SerializedName("targetbankcity")
  private String targetbankcity = null;

  @SerializedName("targetbankpostcode")
  private String targetbankpostcode = null;

  @SerializedName("targetbankcountry")
  private String targetbankcountry = null;

  @SerializedName("targetbankcountry_id")
  private String targetbankcountryId = null;

  public Repeatedbankpayment displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * název
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "název")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Repeatedbankpayment id(String id) {
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

  public Repeatedbankpayment classid(String classid) {
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

  public Repeatedbankpayment objversion(Integer objversion) {
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

  public Repeatedbankpayment repetitioncount(Integer repetitioncount) {
    this.repetitioncount = repetitioncount;
    return this;
  }

   /**
   * opakování [persistentní položka]
   * @return repetitioncount
  **/
  @ApiModelProperty(example = "null", value = "opakování [persistentní položka]")
  public Integer getRepetitioncount() {
    return repetitioncount;
  }

  public void setRepetitioncount(Integer repetitioncount) {
    this.repetitioncount = repetitioncount;
  }

  public Repeatedbankpayment repetitionkind(Integer repetitionkind) {
    this.repetitionkind = repetitionkind;
    return this;
  }

   /**
   * způsob opakování [persistentní položka]
   * @return repetitionkind
  **/
  @ApiModelProperty(example = "null", value = "způsob opakování [persistentní položka]")
  public Integer getRepetitionkind() {
    return repetitionkind;
  }

  public void setRepetitionkind(Integer repetitionkind) {
    this.repetitionkind = repetitionkind;
  }

  public Repeatedbankpayment repeattodatedate(DateTime repeattodatedate) {
    this.repeattodatedate = repeattodatedate;
    return this;
  }

   /**
   * do data [persistentní položka]
   * @return repeattodatedate
  **/
  @ApiModelProperty(example = "null", value = "do data [persistentní položka]")
  public DateTime getRepeattodatedate() {
    return repeattodatedate;
  }

  public void setRepeattodatedate(DateTime repeattodatedate) {
    this.repeattodatedate = repeattodatedate;
  }

  public Repeatedbankpayment lastgendatedate(DateTime lastgendatedate) {
    this.lastgendatedate = lastgendatedate;
    return this;
  }

   /**
   * generováno [persistentní položka]
   * @return lastgendatedate
  **/
  @ApiModelProperty(example = "null", value = "generováno [persistentní položka]")
  public DateTime getLastgendatedate() {
    return lastgendatedate;
  }

  public void setLastgendatedate(DateTime lastgendatedate) {
    this.lastgendatedate = lastgendatedate;
  }

  public Repeatedbankpayment repetitionperiod(Integer repetitionperiod) {
    this.repetitionperiod = repetitionperiod;
    return this;
  }

   /**
   * jak často [persistentní položka]
   * @return repetitionperiod
  **/
  @ApiModelProperty(example = "null", value = "jak často [persistentní položka]")
  public Integer getRepetitionperiod() {
    return repetitionperiod;
  }

  public void setRepetitionperiod(Integer repetitionperiod) {
    this.repetitionperiod = repetitionperiod;
  }

  public Repeatedbankpayment repetitionday(Integer repetitionday) {
    this.repetitionday = repetitionday;
    return this;
  }

   /**
   * den [persistentní položka]
   * @return repetitionday
  **/
  @ApiModelProperty(example = "null", value = "den [persistentní položka]")
  public Integer getRepetitionday() {
    return repetitionday;
  }

  public void setRepetitionday(Integer repetitionday) {
    this.repetitionday = repetitionday;
  }

  public Repeatedbankpayment repetitionmonth(Integer repetitionmonth) {
    this.repetitionmonth = repetitionmonth;
    return this;
  }

   /**
   * měsíc [persistentní položka]
   * @return repetitionmonth
  **/
  @ApiModelProperty(example = "null", value = "měsíc [persistentní položka]")
  public Integer getRepetitionmonth() {
    return repetitionmonth;
  }

  public void setRepetitionmonth(Integer repetitionmonth) {
    this.repetitionmonth = repetitionmonth;
  }

  public Repeatedbankpayment weekendcorrection(Integer weekendcorrection) {
    this.weekendcorrection = weekendcorrection;
    return this;
  }

   /**
   * korekce [persistentní položka]
   * @return weekendcorrection
  **/
  @ApiModelProperty(example = "null", value = "korekce [persistentní položka]")
  public Integer getWeekendcorrection() {
    return weekendcorrection;
  }

  public void setWeekendcorrection(Integer weekendcorrection) {
    this.weekendcorrection = weekendcorrection;
  }

  public Repeatedbankpayment repetitiondaysinweek(String repetitiondaysinweek) {
    this.repetitiondaysinweek = repetitiondaysinweek;
    return this;
  }

   /**
   * dny v týdnu [persistentní položka]
   * @return repetitiondaysinweek
  **/
  @ApiModelProperty(example = "null", value = "dny v týdnu [persistentní položka]")
  public String getRepetitiondaysinweek() {
    return repetitiondaysinweek;
  }

  public void setRepetitiondaysinweek(String repetitiondaysinweek) {
    this.repetitiondaysinweek = repetitiondaysinweek;
  }

  public Repeatedbankpayment description(String description) {
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

  public Repeatedbankpayment amount(Double amount) {
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

  public Repeatedbankpayment currencyId(String currencyId) {
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

  public Repeatedbankpayment countryId(String countryId) {
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

  public Repeatedbankpayment foreignissue(Integer foreignissue) {
    this.foreignissue = foreignissue;
    return this;
  }

   /**
   * způsob úhrady dod.popl [persistentní položka]
   * @return foreignissue
  **/
  @ApiModelProperty(example = "null", value = "způsob úhrady dod.popl [persistentní položka]")
  public Integer getForeignissue() {
    return foreignissue;
  }

  public void setForeignissue(Integer foreignissue) {
    this.foreignissue = foreignissue;
  }

  public Repeatedbankpayment urgent(Integer urgent) {
    this.urgent = urgent;
    return this;
  }

   /**
   * urgence [persistentní položka]
   * @return urgent
  **/
  @ApiModelProperty(example = "null", value = "urgence [persistentní položka]")
  public Integer getUrgent() {
    return urgent;
  }

  public void setUrgent(Integer urgent) {
    this.urgent = urgent;
  }

  public Repeatedbankpayment firmId(String firmId) {
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

  public Repeatedbankpayment targetbankaccount(String targetbankaccount) {
    this.targetbankaccount = targetbankaccount;
    return this;
  }

   /**
   * bankovní účet [persistentní položka]
   * @return targetbankaccount
  **/
  @ApiModelProperty(example = "null", value = "bankovní účet [persistentní položka]")
  public String getTargetbankaccount() {
    return targetbankaccount;
  }

  public void setTargetbankaccount(String targetbankaccount) {
    this.targetbankaccount = targetbankaccount;
  }

  public Repeatedbankpayment targetbankname(String targetbankname) {
    this.targetbankname = targetbankname;
    return this;
  }

   /**
   * název banky [persistentní položka]
   * @return targetbankname
  **/
  @ApiModelProperty(example = "null", value = "název banky [persistentní položka]")
  public String getTargetbankname() {
    return targetbankname;
  }

  public void setTargetbankname(String targetbankname) {
    this.targetbankname = targetbankname;
  }

  public Repeatedbankpayment varsymbol(String varsymbol) {
    this.varsymbol = varsymbol;
    return this;
  }

   /**
   * var. symbol [persistentní položka]
   * @return varsymbol
  **/
  @ApiModelProperty(example = "null", value = "var. symbol [persistentní položka]")
  public String getVarsymbol() {
    return varsymbol;
  }

  public void setVarsymbol(String varsymbol) {
    this.varsymbol = varsymbol;
  }

  public Repeatedbankpayment constsymbolId(String constsymbolId) {
    this.constsymbolId = constsymbolId;
    return this;
  }

   /**
   * konst. symbol; id objektu konstantní symbol [persistentní položka]
   * @return constsymbolId
  **/
  @ApiModelProperty(example = "null", value = "konst. symbol; id objektu konstantní symbol [persistentní položka]")
  public String getConstsymbolId() {
    return constsymbolId;
  }

  public void setConstsymbolId(String constsymbolId) {
    this.constsymbolId = constsymbolId;
  }

  public Repeatedbankpayment specsymbol(String specsymbol) {
    this.specsymbol = specsymbol;
    return this;
  }

   /**
   * spec. symbol [persistentní položka]
   * @return specsymbol
  **/
  @ApiModelProperty(example = "null", value = "spec. symbol [persistentní položka]")
  public String getSpecsymbol() {
    return specsymbol;
  }

  public void setSpecsymbol(String specsymbol) {
    this.specsymbol = specsymbol;
  }

  public Repeatedbankpayment swiftcode(String swiftcode) {
    this.swiftcode = swiftcode;
    return this;
  }

   /**
   * swift [persistentní položka]
   * @return swiftcode
  **/
  @ApiModelProperty(example = "null", value = "swift [persistentní položka]")
  public String getSwiftcode() {
    return swiftcode;
  }

  public void setSwiftcode(String swiftcode) {
    this.swiftcode = swiftcode;
  }

  public Repeatedbankpayment bankaccountId(String bankaccountId) {
    this.bankaccountId = bankaccountId;
    return this;
  }

   /**
   * vlastní účet; id objektu bankovní účet [persistentní položka]
   * @return bankaccountId
  **/
  @ApiModelProperty(example = "null", value = "vlastní účet; id objektu bankovní účet [persistentní položka]")
  public String getBankaccountId() {
    return bankaccountId;
  }

  public void setBankaccountId(String bankaccountId) {
    this.bankaccountId = bankaccountId;
  }

  public Repeatedbankpayment createdbyId(String createdbyId) {
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

  public Repeatedbankpayment correctedbyId(String correctedbyId) {
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

  public Repeatedbankpayment isactive(Boolean isactive) {
    this.isactive = isactive;
    return this;
  }

   /**
   * aktivní
   * @return isactive
  **/
  @ApiModelProperty(example = "null", value = "aktivní")
  public Boolean getIsactive() {
    return isactive;
  }

  public void setIsactive(Boolean isactive) {
    this.isactive = isactive;
  }

  public Repeatedbankpayment targetbankstreet(String targetbankstreet) {
    this.targetbankstreet = targetbankstreet;
    return this;
  }

   /**
   * ulice adresy cílové banky [persistentní položka]
   * @return targetbankstreet
  **/
  @ApiModelProperty(example = "null", value = "ulice adresy cílové banky [persistentní položka]")
  public String getTargetbankstreet() {
    return targetbankstreet;
  }

  public void setTargetbankstreet(String targetbankstreet) {
    this.targetbankstreet = targetbankstreet;
  }

  public Repeatedbankpayment targetbankcity(String targetbankcity) {
    this.targetbankcity = targetbankcity;
    return this;
  }

   /**
   * město adresy cílové banky [persistentní položka]
   * @return targetbankcity
  **/
  @ApiModelProperty(example = "null", value = "město adresy cílové banky [persistentní položka]")
  public String getTargetbankcity() {
    return targetbankcity;
  }

  public void setTargetbankcity(String targetbankcity) {
    this.targetbankcity = targetbankcity;
  }

  public Repeatedbankpayment targetbankpostcode(String targetbankpostcode) {
    this.targetbankpostcode = targetbankpostcode;
    return this;
  }

   /**
   * psČ/zip adresy cílové banky [persistentní položka]
   * @return targetbankpostcode
  **/
  @ApiModelProperty(example = "null", value = "psČ/zip adresy cílové banky [persistentní položka]")
  public String getTargetbankpostcode() {
    return targetbankpostcode;
  }

  public void setTargetbankpostcode(String targetbankpostcode) {
    this.targetbankpostcode = targetbankpostcode;
  }

  public Repeatedbankpayment targetbankcountry(String targetbankcountry) {
    this.targetbankcountry = targetbankcountry;
    return this;
  }

   /**
   * země adresy cílové banky [persistentní položka]
   * @return targetbankcountry
  **/
  @ApiModelProperty(example = "null", value = "země adresy cílové banky [persistentní položka]")
  public String getTargetbankcountry() {
    return targetbankcountry;
  }

  public void setTargetbankcountry(String targetbankcountry) {
    this.targetbankcountry = targetbankcountry;
  }

  public Repeatedbankpayment targetbankcountryId(String targetbankcountryId) {
    this.targetbankcountryId = targetbankcountryId;
    return this;
  }

   /**
   * země cílové banky; id objektu země [persistentní položka]
   * @return targetbankcountryId
  **/
  @ApiModelProperty(example = "null", value = "země cílové banky; id objektu země [persistentní položka]")
  public String getTargetbankcountryId() {
    return targetbankcountryId;
  }

  public void setTargetbankcountryId(String targetbankcountryId) {
    this.targetbankcountryId = targetbankcountryId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Repeatedbankpayment repeatedbankpayment = (Repeatedbankpayment) o;
    return Objects.equals(this.displayname, repeatedbankpayment.displayname) &&
        Objects.equals(this.id, repeatedbankpayment.id) &&
        Objects.equals(this.classid, repeatedbankpayment.classid) &&
        Objects.equals(this.objversion, repeatedbankpayment.objversion) &&
        Objects.equals(this.repetitioncount, repeatedbankpayment.repetitioncount) &&
        Objects.equals(this.repetitionkind, repeatedbankpayment.repetitionkind) &&
        Objects.equals(this.repeattodatedate, repeatedbankpayment.repeattodatedate) &&
        Objects.equals(this.lastgendatedate, repeatedbankpayment.lastgendatedate) &&
        Objects.equals(this.repetitionperiod, repeatedbankpayment.repetitionperiod) &&
        Objects.equals(this.repetitionday, repeatedbankpayment.repetitionday) &&
        Objects.equals(this.repetitionmonth, repeatedbankpayment.repetitionmonth) &&
        Objects.equals(this.weekendcorrection, repeatedbankpayment.weekendcorrection) &&
        Objects.equals(this.repetitiondaysinweek, repeatedbankpayment.repetitiondaysinweek) &&
        Objects.equals(this.description, repeatedbankpayment.description) &&
        Objects.equals(this.amount, repeatedbankpayment.amount) &&
        Objects.equals(this.currencyId, repeatedbankpayment.currencyId) &&
        Objects.equals(this.countryId, repeatedbankpayment.countryId) &&
        Objects.equals(this.foreignissue, repeatedbankpayment.foreignissue) &&
        Objects.equals(this.urgent, repeatedbankpayment.urgent) &&
        Objects.equals(this.firmId, repeatedbankpayment.firmId) &&
        Objects.equals(this.targetbankaccount, repeatedbankpayment.targetbankaccount) &&
        Objects.equals(this.targetbankname, repeatedbankpayment.targetbankname) &&
        Objects.equals(this.varsymbol, repeatedbankpayment.varsymbol) &&
        Objects.equals(this.constsymbolId, repeatedbankpayment.constsymbolId) &&
        Objects.equals(this.specsymbol, repeatedbankpayment.specsymbol) &&
        Objects.equals(this.swiftcode, repeatedbankpayment.swiftcode) &&
        Objects.equals(this.bankaccountId, repeatedbankpayment.bankaccountId) &&
        Objects.equals(this.createdbyId, repeatedbankpayment.createdbyId) &&
        Objects.equals(this.correctedbyId, repeatedbankpayment.correctedbyId) &&
        Objects.equals(this.isactive, repeatedbankpayment.isactive) &&
        Objects.equals(this.targetbankstreet, repeatedbankpayment.targetbankstreet) &&
        Objects.equals(this.targetbankcity, repeatedbankpayment.targetbankcity) &&
        Objects.equals(this.targetbankpostcode, repeatedbankpayment.targetbankpostcode) &&
        Objects.equals(this.targetbankcountry, repeatedbankpayment.targetbankcountry) &&
        Objects.equals(this.targetbankcountryId, repeatedbankpayment.targetbankcountryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, repetitioncount, repetitionkind, repeattodatedate, lastgendatedate, repetitionperiod, repetitionday, repetitionmonth, weekendcorrection, repetitiondaysinweek, description, amount, currencyId, countryId, foreignissue, urgent, firmId, targetbankaccount, targetbankname, varsymbol, constsymbolId, specsymbol, swiftcode, bankaccountId, createdbyId, correctedbyId, isactive, targetbankstreet, targetbankcity, targetbankpostcode, targetbankcountry, targetbankcountryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repeatedbankpayment {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    repetitioncount: ").append(toIndentedString(repetitioncount)).append("\n");
    sb.append("    repetitionkind: ").append(toIndentedString(repetitionkind)).append("\n");
    sb.append("    repeattodatedate: ").append(toIndentedString(repeattodatedate)).append("\n");
    sb.append("    lastgendatedate: ").append(toIndentedString(lastgendatedate)).append("\n");
    sb.append("    repetitionperiod: ").append(toIndentedString(repetitionperiod)).append("\n");
    sb.append("    repetitionday: ").append(toIndentedString(repetitionday)).append("\n");
    sb.append("    repetitionmonth: ").append(toIndentedString(repetitionmonth)).append("\n");
    sb.append("    weekendcorrection: ").append(toIndentedString(weekendcorrection)).append("\n");
    sb.append("    repetitiondaysinweek: ").append(toIndentedString(repetitiondaysinweek)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    foreignissue: ").append(toIndentedString(foreignissue)).append("\n");
    sb.append("    urgent: ").append(toIndentedString(urgent)).append("\n");
    sb.append("    firmId: ").append(toIndentedString(firmId)).append("\n");
    sb.append("    targetbankaccount: ").append(toIndentedString(targetbankaccount)).append("\n");
    sb.append("    targetbankname: ").append(toIndentedString(targetbankname)).append("\n");
    sb.append("    varsymbol: ").append(toIndentedString(varsymbol)).append("\n");
    sb.append("    constsymbolId: ").append(toIndentedString(constsymbolId)).append("\n");
    sb.append("    specsymbol: ").append(toIndentedString(specsymbol)).append("\n");
    sb.append("    swiftcode: ").append(toIndentedString(swiftcode)).append("\n");
    sb.append("    bankaccountId: ").append(toIndentedString(bankaccountId)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    isactive: ").append(toIndentedString(isactive)).append("\n");
    sb.append("    targetbankstreet: ").append(toIndentedString(targetbankstreet)).append("\n");
    sb.append("    targetbankcity: ").append(toIndentedString(targetbankcity)).append("\n");
    sb.append("    targetbankpostcode: ").append(toIndentedString(targetbankpostcode)).append("\n");
    sb.append("    targetbankcountry: ").append(toIndentedString(targetbankcountry)).append("\n");
    sb.append("    targetbankcountryId: ").append(toIndentedString(targetbankcountryId)).append("\n");
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
