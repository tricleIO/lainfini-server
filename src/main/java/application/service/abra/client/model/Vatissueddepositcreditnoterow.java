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
 * Vatissueddepositcreditnoterow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Vatissueddepositcreditnoterow   {
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

  @SerializedName("tamount")
  private Double tamount = null;

  @SerializedName("localtamount")
  private Double localtamount = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  @SerializedName("rowtype")
  private Integer rowtype = null;

  @SerializedName("vatrate_id")
  private String vatrateId = null;

  @SerializedName("vatindex_id")
  private String vatindexId = null;

  @SerializedName("vatrate")
  private Double vatrate = null;

  @SerializedName("tamountwithoutvat")
  private Double tamountwithoutvat = null;

  @SerializedName("localtamountwithoutvat")
  private Double localtamountwithoutvat = null;

  @SerializedName("toesl")
  private Boolean toesl = null;

  @SerializedName("eslstatus")
  private Integer eslstatus = null;

  @SerializedName("paymentamount")
  private Double paymentamount = null;

  @SerializedName("roundingamount")
  private Double roundingamount = null;

  @SerializedName("localroundingamount")
  private Double localroundingamount = null;

  @SerializedName("eslindicator_id")
  private String eslindicatorId = null;

  @SerializedName("esldate$date")
  private DateTime esldatedate = null;

  @SerializedName("drcarticle_id")
  private String drcarticleId = null;

  @SerializedName("drcquantity")
  private Double drcquantity = null;

  @SerializedName("drcqunit")
  private String drcqunit = null;

  @SerializedName("vatmode")
  private Integer vatmode = null;

  @SerializedName("mossservice_id")
  private String mossserviceId = null;

  @SerializedName("rsource_id")
  private String rsourceId = null;

  public Vatissueddepositcreditnoterow displayname(String displayname) {
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

  public Vatissueddepositcreditnoterow id(String id) {
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

  public Vatissueddepositcreditnoterow classid(String classid) {
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

  public Vatissueddepositcreditnoterow objversion(Integer objversion) {
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

  public Vatissueddepositcreditnoterow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu dobropis daň.zál.listu vydaného [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu dobropis daň.zál.listu vydaného [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Vatissueddepositcreditnoterow posindex(Integer posindex) {
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

  public Vatissueddepositcreditnoterow tamount(Double tamount) {
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

  public Vatissueddepositcreditnoterow localtamount(Double localtamount) {
    this.localtamount = localtamount;
    return this;
  }

   /**
   * celkem lokálně [persistentní položka]
   * @return localtamount
  **/
  @ApiModelProperty(example = "null", value = "celkem lokálně [persistentní položka]")
  public Double getLocaltamount() {
    return localtamount;
  }

  public void setLocaltamount(Double localtamount) {
    this.localtamount = localtamount;
  }

  public Vatissueddepositcreditnoterow text(String text) {
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

  public Vatissueddepositcreditnoterow divisionId(String divisionId) {
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

  public Vatissueddepositcreditnoterow busorderId(String busorderId) {
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

  public Vatissueddepositcreditnoterow bustransactionId(String bustransactionId) {
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

  public Vatissueddepositcreditnoterow busprojectId(String busprojectId) {
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

  public Vatissueddepositcreditnoterow rowtype(Integer rowtype) {
    this.rowtype = rowtype;
    return this;
  }

   /**
   * typ [persistentní položka]
   * @return rowtype
  **/
  @ApiModelProperty(example = "null", value = "typ [persistentní položka]")
  public Integer getRowtype() {
    return rowtype;
  }

  public void setRowtype(Integer rowtype) {
    this.rowtype = rowtype;
  }

  public Vatissueddepositcreditnoterow vatrateId(String vatrateId) {
    this.vatrateId = vatrateId;
    return this;
  }

   /**
   * %dph; id objektu dph sazba [persistentní položka]
   * @return vatrateId
  **/
  @ApiModelProperty(example = "null", value = "%dph; id objektu dph sazba [persistentní položka]")
  public String getVatrateId() {
    return vatrateId;
  }

  public void setVatrateId(String vatrateId) {
    this.vatrateId = vatrateId;
  }

  public Vatissueddepositcreditnoterow vatindexId(String vatindexId) {
    this.vatindexId = vatindexId;
    return this;
  }

   /**
   * dphindex; id objektu dph index [persistentní položka]
   * @return vatindexId
  **/
  @ApiModelProperty(example = "null", value = "dphindex; id objektu dph index [persistentní položka]")
  public String getVatindexId() {
    return vatindexId;
  }

  public void setVatindexId(String vatindexId) {
    this.vatindexId = vatindexId;
  }

  public Vatissueddepositcreditnoterow vatrate(Double vatrate) {
    this.vatrate = vatrate;
    return this;
  }

   /**
   * %dph [persistentní položka]
   * @return vatrate
  **/
  @ApiModelProperty(example = "null", value = "%dph [persistentní položka]")
  public Double getVatrate() {
    return vatrate;
  }

  public void setVatrate(Double vatrate) {
    this.vatrate = vatrate;
  }

  public Vatissueddepositcreditnoterow tamountwithoutvat(Double tamountwithoutvat) {
    this.tamountwithoutvat = tamountwithoutvat;
    return this;
  }

   /**
   * bez daně [persistentní položka]
   * @return tamountwithoutvat
  **/
  @ApiModelProperty(example = "null", value = "bez daně [persistentní položka]")
  public Double getTamountwithoutvat() {
    return tamountwithoutvat;
  }

  public void setTamountwithoutvat(Double tamountwithoutvat) {
    this.tamountwithoutvat = tamountwithoutvat;
  }

  public Vatissueddepositcreditnoterow localtamountwithoutvat(Double localtamountwithoutvat) {
    this.localtamountwithoutvat = localtamountwithoutvat;
    return this;
  }

   /**
   * bez daně lokálně [persistentní položka]
   * @return localtamountwithoutvat
  **/
  @ApiModelProperty(example = "null", value = "bez daně lokálně [persistentní položka]")
  public Double getLocaltamountwithoutvat() {
    return localtamountwithoutvat;
  }

  public void setLocaltamountwithoutvat(Double localtamountwithoutvat) {
    this.localtamountwithoutvat = localtamountwithoutvat;
  }

  public Vatissueddepositcreditnoterow toesl(Boolean toesl) {
    this.toesl = toesl;
    return this;
  }

   /**
   * do esl [persistentní položka]
   * @return toesl
  **/
  @ApiModelProperty(example = "null", value = "do esl [persistentní položka]")
  public Boolean getToesl() {
    return toesl;
  }

  public void setToesl(Boolean toesl) {
    this.toesl = toesl;
  }

  public Vatissueddepositcreditnoterow eslstatus(Integer eslstatus) {
    this.eslstatus = eslstatus;
    return this;
  }

   /**
   * do esl
   * @return eslstatus
  **/
  @ApiModelProperty(example = "null", value = "do esl")
  public Integer getEslstatus() {
    return eslstatus;
  }

  public void setEslstatus(Integer eslstatus) {
    this.eslstatus = eslstatus;
  }

  public Vatissueddepositcreditnoterow paymentamount(Double paymentamount) {
    this.paymentamount = paymentamount;
    return this;
  }

   /**
   * Částka platby [persistentní položka]
   * @return paymentamount
  **/
  @ApiModelProperty(example = "null", value = "Částka platby [persistentní položka]")
  public Double getPaymentamount() {
    return paymentamount;
  }

  public void setPaymentamount(Double paymentamount) {
    this.paymentamount = paymentamount;
  }

  public Vatissueddepositcreditnoterow roundingamount(Double roundingamount) {
    this.roundingamount = roundingamount;
    return this;
  }

   /**
   * zaok.v nulové sazbě [persistentní položka]
   * @return roundingamount
  **/
  @ApiModelProperty(example = "null", value = "zaok.v nulové sazbě [persistentní položka]")
  public Double getRoundingamount() {
    return roundingamount;
  }

  public void setRoundingamount(Double roundingamount) {
    this.roundingamount = roundingamount;
  }

  public Vatissueddepositcreditnoterow localroundingamount(Double localroundingamount) {
    this.localroundingamount = localroundingamount;
    return this;
  }

   /**
   * zaok.v nulové sazbě lokálně [persistentní položka]
   * @return localroundingamount
  **/
  @ApiModelProperty(example = "null", value = "zaok.v nulové sazbě lokálně [persistentní položka]")
  public Double getLocalroundingamount() {
    return localroundingamount;
  }

  public void setLocalroundingamount(Double localroundingamount) {
    this.localroundingamount = localroundingamount;
  }

  public Vatissueddepositcreditnoterow eslindicatorId(String eslindicatorId) {
    this.eslindicatorId = eslindicatorId;
    return this;
  }

   /**
   * rozlišení typu plnění(esl); id objektu rozlišení typu plnění(esl) [persistentní položka]
   * @return eslindicatorId
  **/
  @ApiModelProperty(example = "null", value = "rozlišení typu plnění(esl); id objektu rozlišení typu plnění(esl) [persistentní položka]")
  public String getEslindicatorId() {
    return eslindicatorId;
  }

  public void setEslindicatorId(String eslindicatorId) {
    this.eslindicatorId = eslindicatorId;
  }

  public Vatissueddepositcreditnoterow esldatedate(DateTime esldatedate) {
    this.esldatedate = esldatedate;
    return this;
  }

   /**
   * datum pro souhrnné hlášení esl [persistentní položka]
   * @return esldatedate
  **/
  @ApiModelProperty(example = "null", value = "datum pro souhrnné hlášení esl [persistentní položka]")
  public DateTime getEsldatedate() {
    return esldatedate;
  }

  public void setEsldatedate(DateTime esldatedate) {
    this.esldatedate = esldatedate;
  }

  public Vatissueddepositcreditnoterow drcarticleId(String drcarticleId) {
    this.drcarticleId = drcarticleId;
    return this;
  }

   /**
   * typ plnění; id objektu kód typu plnění [persistentní položka]
   * @return drcarticleId
  **/
  @ApiModelProperty(example = "null", value = "typ plnění; id objektu kód typu plnění [persistentní položka]")
  public String getDrcarticleId() {
    return drcarticleId;
  }

  public void setDrcarticleId(String drcarticleId) {
    this.drcarticleId = drcarticleId;
  }

  public Vatissueddepositcreditnoterow drcquantity(Double drcquantity) {
    this.drcquantity = drcquantity;
    return this;
  }

   /**
   * vykazované množství [persistentní položka]
   * @return drcquantity
  **/
  @ApiModelProperty(example = "null", value = "vykazované množství [persistentní položka]")
  public Double getDrcquantity() {
    return drcquantity;
  }

  public void setDrcquantity(Double drcquantity) {
    this.drcquantity = drcquantity;
  }

  public Vatissueddepositcreditnoterow drcqunit(String drcqunit) {
    this.drcqunit = drcqunit;
    return this;
  }

   /**
   * vykazovaná jednotka [persistentní položka]
   * @return drcqunit
  **/
  @ApiModelProperty(example = "null", value = "vykazovaná jednotka [persistentní položka]")
  public String getDrcqunit() {
    return drcqunit;
  }

  public void setDrcqunit(String drcqunit) {
    this.drcqunit = drcqunit;
  }

  public Vatissueddepositcreditnoterow vatmode(Integer vatmode) {
    this.vatmode = vatmode;
    return this;
  }

   /**
   * režim dph [persistentní položka]
   * @return vatmode
  **/
  @ApiModelProperty(example = "null", value = "režim dph [persistentní položka]")
  public Integer getVatmode() {
    return vatmode;
  }

  public void setVatmode(Integer vatmode) {
    this.vatmode = vatmode;
  }

  public Vatissueddepositcreditnoterow mossserviceId(String mossserviceId) {
    this.mossserviceId = mossserviceId;
    return this;
  }

   /**
   * druh poskytnuté služby moss; id objektu druhy poskytovaných služeb moss [persistentní položka]
   * @return mossserviceId
  **/
  @ApiModelProperty(example = "null", value = "druh poskytnuté služby moss; id objektu druhy poskytovaných služeb moss [persistentní položka]")
  public String getMossserviceId() {
    return mossserviceId;
  }

  public void setMossserviceId(String mossserviceId) {
    this.mossserviceId = mossserviceId;
  }

  public Vatissueddepositcreditnoterow rsourceId(String rsourceId) {
    this.rsourceId = rsourceId;
    return this;
  }

   /**
   * Ř. dobr.dokladu; id objektu daňový zálohový list vydaný - řádek [persistentní položka]
   * @return rsourceId
  **/
  @ApiModelProperty(example = "null", value = "Ř. dobr.dokladu; id objektu daňový zálohový list vydaný - řádek [persistentní položka]")
  public String getRsourceId() {
    return rsourceId;
  }

  public void setRsourceId(String rsourceId) {
    this.rsourceId = rsourceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vatissueddepositcreditnoterow vatissueddepositcreditnoterow = (Vatissueddepositcreditnoterow) o;
    return Objects.equals(this.displayname, vatissueddepositcreditnoterow.displayname) &&
        Objects.equals(this.id, vatissueddepositcreditnoterow.id) &&
        Objects.equals(this.classid, vatissueddepositcreditnoterow.classid) &&
        Objects.equals(this.objversion, vatissueddepositcreditnoterow.objversion) &&
        Objects.equals(this.parentId, vatissueddepositcreditnoterow.parentId) &&
        Objects.equals(this.posindex, vatissueddepositcreditnoterow.posindex) &&
        Objects.equals(this.tamount, vatissueddepositcreditnoterow.tamount) &&
        Objects.equals(this.localtamount, vatissueddepositcreditnoterow.localtamount) &&
        Objects.equals(this.text, vatissueddepositcreditnoterow.text) &&
        Objects.equals(this.divisionId, vatissueddepositcreditnoterow.divisionId) &&
        Objects.equals(this.busorderId, vatissueddepositcreditnoterow.busorderId) &&
        Objects.equals(this.bustransactionId, vatissueddepositcreditnoterow.bustransactionId) &&
        Objects.equals(this.busprojectId, vatissueddepositcreditnoterow.busprojectId) &&
        Objects.equals(this.rowtype, vatissueddepositcreditnoterow.rowtype) &&
        Objects.equals(this.vatrateId, vatissueddepositcreditnoterow.vatrateId) &&
        Objects.equals(this.vatindexId, vatissueddepositcreditnoterow.vatindexId) &&
        Objects.equals(this.vatrate, vatissueddepositcreditnoterow.vatrate) &&
        Objects.equals(this.tamountwithoutvat, vatissueddepositcreditnoterow.tamountwithoutvat) &&
        Objects.equals(this.localtamountwithoutvat, vatissueddepositcreditnoterow.localtamountwithoutvat) &&
        Objects.equals(this.toesl, vatissueddepositcreditnoterow.toesl) &&
        Objects.equals(this.eslstatus, vatissueddepositcreditnoterow.eslstatus) &&
        Objects.equals(this.paymentamount, vatissueddepositcreditnoterow.paymentamount) &&
        Objects.equals(this.roundingamount, vatissueddepositcreditnoterow.roundingamount) &&
        Objects.equals(this.localroundingamount, vatissueddepositcreditnoterow.localroundingamount) &&
        Objects.equals(this.eslindicatorId, vatissueddepositcreditnoterow.eslindicatorId) &&
        Objects.equals(this.esldatedate, vatissueddepositcreditnoterow.esldatedate) &&
        Objects.equals(this.drcarticleId, vatissueddepositcreditnoterow.drcarticleId) &&
        Objects.equals(this.drcquantity, vatissueddepositcreditnoterow.drcquantity) &&
        Objects.equals(this.drcqunit, vatissueddepositcreditnoterow.drcqunit) &&
        Objects.equals(this.vatmode, vatissueddepositcreditnoterow.vatmode) &&
        Objects.equals(this.mossserviceId, vatissueddepositcreditnoterow.mossserviceId) &&
        Objects.equals(this.rsourceId, vatissueddepositcreditnoterow.rsourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, tamount, localtamount, text, divisionId, busorderId, bustransactionId, busprojectId, rowtype, vatrateId, vatindexId, vatrate, tamountwithoutvat, localtamountwithoutvat, toesl, eslstatus, paymentamount, roundingamount, localroundingamount, eslindicatorId, esldatedate, drcarticleId, drcquantity, drcqunit, vatmode, mossserviceId, rsourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vatissueddepositcreditnoterow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    tamount: ").append(toIndentedString(tamount)).append("\n");
    sb.append("    localtamount: ").append(toIndentedString(localtamount)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    busorderId: ").append(toIndentedString(busorderId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    busprojectId: ").append(toIndentedString(busprojectId)).append("\n");
    sb.append("    rowtype: ").append(toIndentedString(rowtype)).append("\n");
    sb.append("    vatrateId: ").append(toIndentedString(vatrateId)).append("\n");
    sb.append("    vatindexId: ").append(toIndentedString(vatindexId)).append("\n");
    sb.append("    vatrate: ").append(toIndentedString(vatrate)).append("\n");
    sb.append("    tamountwithoutvat: ").append(toIndentedString(tamountwithoutvat)).append("\n");
    sb.append("    localtamountwithoutvat: ").append(toIndentedString(localtamountwithoutvat)).append("\n");
    sb.append("    toesl: ").append(toIndentedString(toesl)).append("\n");
    sb.append("    eslstatus: ").append(toIndentedString(eslstatus)).append("\n");
    sb.append("    paymentamount: ").append(toIndentedString(paymentamount)).append("\n");
    sb.append("    roundingamount: ").append(toIndentedString(roundingamount)).append("\n");
    sb.append("    localroundingamount: ").append(toIndentedString(localroundingamount)).append("\n");
    sb.append("    eslindicatorId: ").append(toIndentedString(eslindicatorId)).append("\n");
    sb.append("    esldatedate: ").append(toIndentedString(esldatedate)).append("\n");
    sb.append("    drcarticleId: ").append(toIndentedString(drcarticleId)).append("\n");
    sb.append("    drcquantity: ").append(toIndentedString(drcquantity)).append("\n");
    sb.append("    drcqunit: ").append(toIndentedString(drcqunit)).append("\n");
    sb.append("    vatmode: ").append(toIndentedString(vatmode)).append("\n");
    sb.append("    mossserviceId: ").append(toIndentedString(mossserviceId)).append("\n");
    sb.append("    rsourceId: ").append(toIndentedString(rsourceId)).append("\n");
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

