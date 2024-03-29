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
 * Compensationrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Compensationrow   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("posindex")
  private Integer posindex = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("firm_id")
  private String firmId = null;

  @SerializedName("currency_id")
  private String currencyId = null;

  @SerializedName("currrate")
  private Double currrate = null;

  @SerializedName("refcurrrate")
  private Double refcurrrate = null;

  @SerializedName("credit")
  private Boolean credit = null;

  @SerializedName("varsymbol")
  private String varsymbol = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("tamount")
  private Double tamount = null;

  @SerializedName("localtamount")
  private Double localtamount = null;

  @SerializedName("docdate$date")
  private DateTime docdatedate = null;

  @SerializedName("pamount")
  private Double pamount = null;

  @SerializedName("pdocumenttype")
  private String pdocumenttype = null;

  @SerializedName("pdocument_id")
  private String pdocumentId = null;

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

  @SerializedName("accpresetdef_id")
  private String accpresetdefId = null;

  @SerializedName("accdate$date")
  private DateTime accdatedate = null;

  @SerializedName("pdiskind")
  private Integer pdiskind = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  @SerializedName("correctionrow")
  private Boolean correctionrow = null;

  public Compensationrow displayname(String displayname) {
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

  public Compensationrow id(String id) {
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

  public Compensationrow classid(String classid) {
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

  public Compensationrow objversion(Integer objversion) {
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

  public Compensationrow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu vzájemný zápočet [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu vzájemný zápočet [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Compensationrow posindex(Integer posindex) {
    this.posindex = posindex;
    return this;
  }

   /**
   * pořadí [persistentní položka]
   * @return posindex
  **/
  @ApiModelProperty(example = "null", value = "pořadí [persistentní položka]")
  public Integer getPosindex() {
    return posindex;
  }

  public void setPosindex(Integer posindex) {
    this.posindex = posindex;
  }

  public Compensationrow divisionId(String divisionId) {
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

  public Compensationrow busorderId(String busorderId) {
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

  public Compensationrow bustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
    return this;
  }

   /**
   * obch.případ; id objektu obchodní případ [persistentní položka]
   * @return bustransactionId
  **/
  @ApiModelProperty(example = "null", value = "obch.případ; id objektu obchodní případ [persistentní položka]")
  public String getBustransactionId() {
    return bustransactionId;
  }

  public void setBustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
  }

  public Compensationrow firmId(String firmId) {
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

  public Compensationrow currencyId(String currencyId) {
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

  public Compensationrow currrate(Double currrate) {
    this.currrate = currrate;
    return this;
  }

   /**
   * kurz [persistentní položka]
   * @return currrate
  **/
  @ApiModelProperty(example = "null", value = "kurz [persistentní položka]")
  public Double getCurrrate() {
    return currrate;
  }

  public void setCurrrate(Double currrate) {
    this.currrate = currrate;
  }

  public Compensationrow refcurrrate(Double refcurrrate) {
    this.refcurrrate = refcurrrate;
    return this;
  }

   /**
   * vztažný [persistentní položka]
   * @return refcurrrate
  **/
  @ApiModelProperty(example = "null", value = "vztažný [persistentní položka]")
  public Double getRefcurrrate() {
    return refcurrrate;
  }

  public void setRefcurrrate(Double refcurrrate) {
    this.refcurrrate = refcurrrate;
  }

  public Compensationrow credit(Boolean credit) {
    this.credit = credit;
    return this;
  }

   /**
   * kredit [persistentní položka]
   * @return credit
  **/
  @ApiModelProperty(example = "null", value = "kredit [persistentní položka]")
  public Boolean getCredit() {
    return credit;
  }

  public void setCredit(Boolean credit) {
    this.credit = credit;
  }

  public Compensationrow varsymbol(String varsymbol) {
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

  public Compensationrow amount(Double amount) {
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

  public Compensationrow tamount(Double tamount) {
    this.tamount = tamount;
    return this;
  }

   /**
   * celkem [persistentní položka]
   * @return tamount
  **/
  @ApiModelProperty(example = "null", value = "celkem [persistentní položka]")
  public Double getTamount() {
    return tamount;
  }

  public void setTamount(Double tamount) {
    this.tamount = tamount;
  }

  public Compensationrow localtamount(Double localtamount) {
    this.localtamount = localtamount;
    return this;
  }

   /**
   * celkem lokální [persistentní položka]
   * @return localtamount
  **/
  @ApiModelProperty(example = "null", value = "celkem lokální [persistentní položka]")
  public Double getLocaltamount() {
    return localtamount;
  }

  public void setLocaltamount(Double localtamount) {
    this.localtamount = localtamount;
  }

  public Compensationrow docdatedate(DateTime docdatedate) {
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

  public Compensationrow pamount(Double pamount) {
    this.pamount = pamount;
    return this;
  }

   /**
   * platba [persistentní položka]
   * @return pamount
  **/
  @ApiModelProperty(example = "null", value = "platba [persistentní položka]")
  public Double getPamount() {
    return pamount;
  }

  public void setPamount(Double pamount) {
    this.pamount = pamount;
  }

  public Compensationrow pdocumenttype(String pdocumenttype) {
    this.pdocumenttype = pdocumenttype;
    return this;
  }

   /**
   * typ plac.dokl. [persistentní položka]
   * @return pdocumenttype
  **/
  @ApiModelProperty(example = "null", value = "typ plac.dokl. [persistentní položka]")
  public String getPdocumenttype() {
    return pdocumenttype;
  }

  public void setPdocumenttype(String pdocumenttype) {
    this.pdocumenttype = pdocumenttype;
  }

  public Compensationrow pdocumentId(String pdocumentId) {
    this.pdocumentId = pdocumentId;
    return this;
  }

   /**
   * plac.doklad; id objektu dokument [persistentní položka]
   * @return pdocumentId
  **/
  @ApiModelProperty(example = "null", value = "plac.doklad; id objektu dokument [persistentní položka]")
  public String getPdocumentId() {
    return pdocumentId;
  }

  public void setPdocumentId(String pdocumentId) {
    this.pdocumentId = pdocumentId;
  }

  public Compensationrow coef(Integer coef) {
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

  public Compensationrow localcoef(Integer localcoef) {
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

  public Compensationrow zoneId(String zoneId) {
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

  public Compensationrow localzoneId(String localzoneId) {
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

  public Compensationrow refcurrencyId(String refcurrencyId) {
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

  public Compensationrow localrefcurrencyId(String localrefcurrencyId) {
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

  public Compensationrow accpresetdefId(String accpresetdefId) {
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

  public Compensationrow accdatedate(DateTime accdatedate) {
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

  public Compensationrow pdiskind(Integer pdiskind) {
    this.pdiskind = pdiskind;
    return this;
  }

   /**
   * rozdělení [persistentní položka]
   * @return pdiskind
  **/
  @ApiModelProperty(example = "null", value = "rozdělení [persistentní položka]")
  public Integer getPdiskind() {
    return pdiskind;
  }

  public void setPdiskind(Integer pdiskind) {
    this.pdiskind = pdiskind;
  }

  public Compensationrow text(String text) {
    this.text = text;
    return this;
  }

   /**
   * text [persistentní položka]
   * @return text
  **/
  @ApiModelProperty(example = "null", value = "text [persistentní položka]")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Compensationrow busprojectId(String busprojectId) {
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

  public Compensationrow correctionrow(Boolean correctionrow) {
    this.correctionrow = correctionrow;
    return this;
  }

   /**
   * korekční řádek [persistentní položka]
   * @return correctionrow
  **/
  @ApiModelProperty(example = "null", value = "korekční řádek [persistentní položka]")
  public Boolean getCorrectionrow() {
    return correctionrow;
  }

  public void setCorrectionrow(Boolean correctionrow) {
    this.correctionrow = correctionrow;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Compensationrow compensationrow = (Compensationrow) o;
    return Objects.equals(this.displayname, compensationrow.displayname) &&
        Objects.equals(this.id, compensationrow.id) &&
        Objects.equals(this.classid, compensationrow.classid) &&
        Objects.equals(this.objversion, compensationrow.objversion) &&
        Objects.equals(this.parentId, compensationrow.parentId) &&
        Objects.equals(this.posindex, compensationrow.posindex) &&
        Objects.equals(this.divisionId, compensationrow.divisionId) &&
        Objects.equals(this.busorderId, compensationrow.busorderId) &&
        Objects.equals(this.bustransactionId, compensationrow.bustransactionId) &&
        Objects.equals(this.firmId, compensationrow.firmId) &&
        Objects.equals(this.currencyId, compensationrow.currencyId) &&
        Objects.equals(this.currrate, compensationrow.currrate) &&
        Objects.equals(this.refcurrrate, compensationrow.refcurrrate) &&
        Objects.equals(this.credit, compensationrow.credit) &&
        Objects.equals(this.varsymbol, compensationrow.varsymbol) &&
        Objects.equals(this.amount, compensationrow.amount) &&
        Objects.equals(this.tamount, compensationrow.tamount) &&
        Objects.equals(this.localtamount, compensationrow.localtamount) &&
        Objects.equals(this.docdatedate, compensationrow.docdatedate) &&
        Objects.equals(this.pamount, compensationrow.pamount) &&
        Objects.equals(this.pdocumenttype, compensationrow.pdocumenttype) &&
        Objects.equals(this.pdocumentId, compensationrow.pdocumentId) &&
        Objects.equals(this.coef, compensationrow.coef) &&
        Objects.equals(this.localcoef, compensationrow.localcoef) &&
        Objects.equals(this.zoneId, compensationrow.zoneId) &&
        Objects.equals(this.localzoneId, compensationrow.localzoneId) &&
        Objects.equals(this.refcurrencyId, compensationrow.refcurrencyId) &&
        Objects.equals(this.localrefcurrencyId, compensationrow.localrefcurrencyId) &&
        Objects.equals(this.accpresetdefId, compensationrow.accpresetdefId) &&
        Objects.equals(this.accdatedate, compensationrow.accdatedate) &&
        Objects.equals(this.pdiskind, compensationrow.pdiskind) &&
        Objects.equals(this.text, compensationrow.text) &&
        Objects.equals(this.busprojectId, compensationrow.busprojectId) &&
        Objects.equals(this.correctionrow, compensationrow.correctionrow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, divisionId, busorderId, bustransactionId, firmId, currencyId, currrate, refcurrrate, credit, varsymbol, amount, tamount, localtamount, docdatedate, pamount, pdocumenttype, pdocumentId, coef, localcoef, zoneId, localzoneId, refcurrencyId, localrefcurrencyId, accpresetdefId, accdatedate, pdiskind, text, busprojectId, correctionrow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Compensationrow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    busorderId: ").append(toIndentedString(busorderId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    firmId: ").append(toIndentedString(firmId)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    currrate: ").append(toIndentedString(currrate)).append("\n");
    sb.append("    refcurrrate: ").append(toIndentedString(refcurrrate)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    varsymbol: ").append(toIndentedString(varsymbol)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    tamount: ").append(toIndentedString(tamount)).append("\n");
    sb.append("    localtamount: ").append(toIndentedString(localtamount)).append("\n");
    sb.append("    docdatedate: ").append(toIndentedString(docdatedate)).append("\n");
    sb.append("    pamount: ").append(toIndentedString(pamount)).append("\n");
    sb.append("    pdocumenttype: ").append(toIndentedString(pdocumenttype)).append("\n");
    sb.append("    pdocumentId: ").append(toIndentedString(pdocumentId)).append("\n");
    sb.append("    coef: ").append(toIndentedString(coef)).append("\n");
    sb.append("    localcoef: ").append(toIndentedString(localcoef)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    localzoneId: ").append(toIndentedString(localzoneId)).append("\n");
    sb.append("    refcurrencyId: ").append(toIndentedString(refcurrencyId)).append("\n");
    sb.append("    localrefcurrencyId: ").append(toIndentedString(localrefcurrencyId)).append("\n");
    sb.append("    accpresetdefId: ").append(toIndentedString(accpresetdefId)).append("\n");
    sb.append("    accdatedate: ").append(toIndentedString(accdatedate)).append("\n");
    sb.append("    pdiskind: ").append(toIndentedString(pdiskind)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    busprojectId: ").append(toIndentedString(busprojectId)).append("\n");
    sb.append("    correctionrow: ").append(toIndentedString(correctionrow)).append("\n");
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

