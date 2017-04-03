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
 * Issueddepositusage
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Issueddepositusage   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("depositdocument_id")
  private String depositdocumentId = null;

  @SerializedName("paymentdate$date")
  private DateTime paymentdatedate = null;

  @SerializedName("accdate$date")
  private DateTime accdatedate = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("localamount")
  private Double localamount = null;

  @SerializedName("pamount")
  private Double pamount = null;

  @SerializedName("pdocument_id")
  private String pdocumentId = null;

  @SerializedName("pdocumenttype")
  private String pdocumenttype = null;

  @SerializedName("pdiskind")
  private Integer pdiskind = null;

  @SerializedName("accpresetdef_id")
  private String accpresetdefId = null;

  @SerializedName("currency_id")
  private String currencyId = null;

  @SerializedName("accdocqueue_id")
  private String accdocqueueId = null;

  @SerializedName("sourcegroupidentical_id")
  private String sourcegroupidenticalId = null;

  public Issueddepositusage displayname(String displayname) {
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

  public Issueddepositusage id(String id) {
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

  public Issueddepositusage classid(String classid) {
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

  public Issueddepositusage objversion(Integer objversion) {
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

  public Issueddepositusage depositdocumentId(String depositdocumentId) {
    this.depositdocumentId = depositdocumentId;
    return this;
  }

   /**
   * zálohový list; id objektu zálohový list vydaný [persistentní položka]
   * @return depositdocumentId
  **/
  @ApiModelProperty(example = "null", value = "zálohový list; id objektu zálohový list vydaný [persistentní položka]")
  public String getDepositdocumentId() {
    return depositdocumentId;
  }

  public void setDepositdocumentId(String depositdocumentId) {
    this.depositdocumentId = depositdocumentId;
  }

  public Issueddepositusage paymentdatedate(DateTime paymentdatedate) {
    this.paymentdatedate = paymentdatedate;
    return this;
  }

   /**
   * datum zúčtování [persistentní položka]
   * @return paymentdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum zúčtování [persistentní položka]")
  public DateTime getPaymentdatedate() {
    return paymentdatedate;
  }

  public void setPaymentdatedate(DateTime paymentdatedate) {
    this.paymentdatedate = paymentdatedate;
  }

  public Issueddepositusage accdatedate(DateTime accdatedate) {
    this.accdatedate = accdatedate;
    return this;
  }

   /**
   * datum účtování [persistentní položka]
   * @return accdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum účtování [persistentní položka]")
  public DateTime getAccdatedate() {
    return accdatedate;
  }

  public void setAccdatedate(DateTime accdatedate) {
    this.accdatedate = accdatedate;
  }

  public Issueddepositusage createdbyId(String createdbyId) {
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

  public Issueddepositusage correctedbyId(String correctedbyId) {
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

  public Issueddepositusage amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * celková částka [persistentní položka]
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "celková částka [persistentní položka]")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Issueddepositusage localamount(Double localamount) {
    this.localamount = localamount;
    return this;
  }

   /**
   * celk. částka lok. [persistentní položka]
   * @return localamount
  **/
  @ApiModelProperty(example = "null", value = "celk. částka lok. [persistentní položka]")
  public Double getLocalamount() {
    return localamount;
  }

  public void setLocalamount(Double localamount) {
    this.localamount = localamount;
  }

  public Issueddepositusage pamount(Double pamount) {
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

  public Issueddepositusage pdocumentId(String pdocumentId) {
    this.pdocumentId = pdocumentId;
    return this;
  }

   /**
   * placený doklad; id objektu dokument [persistentní položka]
   * @return pdocumentId
  **/
  @ApiModelProperty(example = "null", value = "placený doklad; id objektu dokument [persistentní položka]")
  public String getPdocumentId() {
    return pdocumentId;
  }

  public void setPdocumentId(String pdocumentId) {
    this.pdocumentId = pdocumentId;
  }

  public Issueddepositusage pdocumenttype(String pdocumenttype) {
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

  public Issueddepositusage pdiskind(Integer pdiskind) {
    this.pdiskind = pdiskind;
    return this;
  }

   /**
   * rozdělení platby [persistentní položka]
   * @return pdiskind
  **/
  @ApiModelProperty(example = "null", value = "rozdělení platby [persistentní položka]")
  public Integer getPdiskind() {
    return pdiskind;
  }

  public void setPdiskind(Integer pdiskind) {
    this.pdiskind = pdiskind;
  }

  public Issueddepositusage accpresetdefId(String accpresetdefId) {
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

  public Issueddepositusage currencyId(String currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * měna; id objektu měna
   * @return currencyId
  **/
  @ApiModelProperty(example = "null", value = "měna; id objektu měna")
  public String getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }

  public Issueddepositusage accdocqueueId(String accdocqueueId) {
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

  public Issueddepositusage sourcegroupidenticalId(String sourcegroupidenticalId) {
    this.sourcegroupidenticalId = sourcegroupidenticalId;
    return this;
  }

   /**
   * souv. zdrojových skupin; id objektu souvislost zdrojových skupin [persistentní položka]
   * @return sourcegroupidenticalId
  **/
  @ApiModelProperty(example = "null", value = "souv. zdrojových skupin; id objektu souvislost zdrojových skupin [persistentní položka]")
  public String getSourcegroupidenticalId() {
    return sourcegroupidenticalId;
  }

  public void setSourcegroupidenticalId(String sourcegroupidenticalId) {
    this.sourcegroupidenticalId = sourcegroupidenticalId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Issueddepositusage issueddepositusage = (Issueddepositusage) o;
    return Objects.equals(this.displayname, issueddepositusage.displayname) &&
        Objects.equals(this.id, issueddepositusage.id) &&
        Objects.equals(this.classid, issueddepositusage.classid) &&
        Objects.equals(this.objversion, issueddepositusage.objversion) &&
        Objects.equals(this.depositdocumentId, issueddepositusage.depositdocumentId) &&
        Objects.equals(this.paymentdatedate, issueddepositusage.paymentdatedate) &&
        Objects.equals(this.accdatedate, issueddepositusage.accdatedate) &&
        Objects.equals(this.createdbyId, issueddepositusage.createdbyId) &&
        Objects.equals(this.correctedbyId, issueddepositusage.correctedbyId) &&
        Objects.equals(this.amount, issueddepositusage.amount) &&
        Objects.equals(this.localamount, issueddepositusage.localamount) &&
        Objects.equals(this.pamount, issueddepositusage.pamount) &&
        Objects.equals(this.pdocumentId, issueddepositusage.pdocumentId) &&
        Objects.equals(this.pdocumenttype, issueddepositusage.pdocumenttype) &&
        Objects.equals(this.pdiskind, issueddepositusage.pdiskind) &&
        Objects.equals(this.accpresetdefId, issueddepositusage.accpresetdefId) &&
        Objects.equals(this.currencyId, issueddepositusage.currencyId) &&
        Objects.equals(this.accdocqueueId, issueddepositusage.accdocqueueId) &&
        Objects.equals(this.sourcegroupidenticalId, issueddepositusage.sourcegroupidenticalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, depositdocumentId, paymentdatedate, accdatedate, createdbyId, correctedbyId, amount, localamount, pamount, pdocumentId, pdocumenttype, pdiskind, accpresetdefId, currencyId, accdocqueueId, sourcegroupidenticalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Issueddepositusage {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    depositdocumentId: ").append(toIndentedString(depositdocumentId)).append("\n");
    sb.append("    paymentdatedate: ").append(toIndentedString(paymentdatedate)).append("\n");
    sb.append("    accdatedate: ").append(toIndentedString(accdatedate)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    localamount: ").append(toIndentedString(localamount)).append("\n");
    sb.append("    pamount: ").append(toIndentedString(pamount)).append("\n");
    sb.append("    pdocumentId: ").append(toIndentedString(pdocumentId)).append("\n");
    sb.append("    pdocumenttype: ").append(toIndentedString(pdocumenttype)).append("\n");
    sb.append("    pdiskind: ").append(toIndentedString(pdiskind)).append("\n");
    sb.append("    accpresetdefId: ").append(toIndentedString(accpresetdefId)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    accdocqueueId: ").append(toIndentedString(accdocqueueId)).append("\n");
    sb.append("    sourcegroupidenticalId: ").append(toIndentedString(sourcegroupidenticalId)).append("\n");
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

