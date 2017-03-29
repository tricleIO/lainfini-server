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

import java.util.Objects;


/**
 * Documenttype
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Documenttype   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("docqueuecode")
  private String docqueuecode = null;

  @SerializedName("toaccount")
  private Boolean toaccount = null;

  @SerializedName("summaryaccounted")
  private Boolean summaryaccounted = null;

  @SerializedName("accpresetdef")
  private Boolean accpresetdef = null;

  @SerializedName("throughbank")
  private Boolean throughbank = null;

  @SerializedName("paymentkind")
  private Integer paymentkind = null;

  @SerializedName("reverseaccounting")
  private Boolean reverseaccounting = null;

  @SerializedName("defaultsummaryaccounted")
  private Boolean defaultsummaryaccounted = null;

  @SerializedName("accountcode")
  private String accountcode = null;

  @SerializedName("forceaccounting")
  private Boolean forceaccounting = null;

  @SerializedName("reversedepositaccounting")
  private Boolean reversedepositaccounting = null;

  @SerializedName("currencyfromfirm")
  private Boolean currencyfromfirm = null;

  public Documenttype displayname(String displayname) {
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

  public Documenttype id(String id) {
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

  public Documenttype classid(String classid) {
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

  public Documenttype objversion(Integer objversion) {
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

  public Documenttype code(String code) {
    this.code = code;
    return this;
  }

   /**
   * kód [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "kód [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Documenttype name(String name) {
    this.name = name;
    return this;
  }

   /**
   * název [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "název [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Documenttype docqueuecode(String docqueuecode) {
    this.docqueuecode = docqueuecode;
    return this;
  }

   /**
   * zkratka [persistentní položka]
   * @return docqueuecode
  **/
  @ApiModelProperty(example = "null", value = "zkratka [persistentní položka]")
  public String getDocqueuecode() {
    return docqueuecode;
  }

  public void setDocqueuecode(String docqueuecode) {
    this.docqueuecode = docqueuecode;
  }

  public Documenttype toaccount(Boolean toaccount) {
    this.toaccount = toaccount;
    return this;
  }

   /**
   * Účtovat [persistentní položka]
   * @return toaccount
  **/
  @ApiModelProperty(example = "null", value = "Účtovat [persistentní položka]")
  public Boolean getToaccount() {
    return toaccount;
  }

  public void setToaccount(Boolean toaccount) {
    this.toaccount = toaccount;
  }

  public Documenttype summaryaccounted(Boolean summaryaccounted) {
    this.summaryaccounted = summaryaccounted;
    return this;
  }

   /**
   * způsob účtování [persistentní položka]
   * @return summaryaccounted
  **/
  @ApiModelProperty(example = "null", value = "způsob účtování [persistentní položka]")
  public Boolean getSummaryaccounted() {
    return summaryaccounted;
  }

  public void setSummaryaccounted(Boolean summaryaccounted) {
    this.summaryaccounted = summaryaccounted;
  }

  public Documenttype accpresetdef(Boolean accpresetdef) {
    this.accpresetdef = accpresetdef;
    return this;
  }

   /**
   * předkontace [persistentní položka]
   * @return accpresetdef
  **/
  @ApiModelProperty(example = "null", value = "předkontace [persistentní položka]")
  public Boolean getAccpresetdef() {
    return accpresetdef;
  }

  public void setAccpresetdef(Boolean accpresetdef) {
    this.accpresetdef = accpresetdef;
  }

  public Documenttype throughbank(Boolean throughbank) {
    this.throughbank = throughbank;
    return this;
  }

   /**
   * bankou [persistentní položka]
   * @return throughbank
  **/
  @ApiModelProperty(example = "null", value = "bankou [persistentní položka]")
  public Boolean getThroughbank() {
    return throughbank;
  }

  public void setThroughbank(Boolean throughbank) {
    this.throughbank = throughbank;
  }

  public Documenttype paymentkind(Integer paymentkind) {
    this.paymentkind = paymentkind;
    return this;
  }

   /**
   * typ platby [persistentní položka]
   * @return paymentkind
  **/
  @ApiModelProperty(example = "null", value = "typ platby [persistentní položka]")
  public Integer getPaymentkind() {
    return paymentkind;
  }

  public void setPaymentkind(Integer paymentkind) {
    this.paymentkind = paymentkind;
  }

  public Documenttype reverseaccounting(Boolean reverseaccounting) {
    this.reverseaccounting = reverseaccounting;
    return this;
  }

   /**
   * Účtovat obráceně [persistentní položka]
   * @return reverseaccounting
  **/
  @ApiModelProperty(example = "null", value = "Účtovat obráceně [persistentní položka]")
  public Boolean getReverseaccounting() {
    return reverseaccounting;
  }

  public void setReverseaccounting(Boolean reverseaccounting) {
    this.reverseaccounting = reverseaccounting;
  }

  public Documenttype defaultsummaryaccounted(Boolean defaultsummaryaccounted) {
    this.defaultsummaryaccounted = defaultsummaryaccounted;
    return this;
  }

   /**
   * doporučeno účtovat souhrnně [persistentní položka]
   * @return defaultsummaryaccounted
  **/
  @ApiModelProperty(example = "null", value = "doporučeno účtovat souhrnně [persistentní položka]")
  public Boolean getDefaultsummaryaccounted() {
    return defaultsummaryaccounted;
  }

  public void setDefaultsummaryaccounted(Boolean defaultsummaryaccounted) {
    this.defaultsummaryaccounted = defaultsummaryaccounted;
  }

  public Documenttype accountcode(String accountcode) {
    this.accountcode = accountcode;
    return this;
  }

   /**
   * Účet [persistentní položka]
   * @return accountcode
  **/
  @ApiModelProperty(example = "null", value = "Účet [persistentní položka]")
  public String getAccountcode() {
    return accountcode;
  }

  public void setAccountcode(String accountcode) {
    this.accountcode = accountcode;
  }

  public Documenttype forceaccounting(Boolean forceaccounting) {
    this.forceaccounting = forceaccounting;
    return this;
  }

   /**
   * přeúčtovávat vždy [persistentní položka]
   * @return forceaccounting
  **/
  @ApiModelProperty(example = "null", value = "přeúčtovávat vždy [persistentní položka]")
  public Boolean getForceaccounting() {
    return forceaccounting;
  }

  public void setForceaccounting(Boolean forceaccounting) {
    this.forceaccounting = forceaccounting;
  }

  public Documenttype reversedepositaccounting(Boolean reversedepositaccounting) {
    this.reversedepositaccounting = reversedepositaccounting;
    return this;
  }

   /**
   * Účtovat kladně zálohy [persistentní položka]
   * @return reversedepositaccounting
  **/
  @ApiModelProperty(example = "null", value = "Účtovat kladně zálohy [persistentní položka]")
  public Boolean getReversedepositaccounting() {
    return reversedepositaccounting;
  }

  public void setReversedepositaccounting(Boolean reversedepositaccounting) {
    this.reversedepositaccounting = reversedepositaccounting;
  }

  public Documenttype currencyfromfirm(Boolean currencyfromfirm) {
    this.currencyfromfirm = currencyfromfirm;
    return this;
  }

   /**
   * předvyplnění měny z firmy [persistentní položka]
   * @return currencyfromfirm
  **/
  @ApiModelProperty(example = "null", value = "předvyplnění měny z firmy [persistentní položka]")
  public Boolean getCurrencyfromfirm() {
    return currencyfromfirm;
  }

  public void setCurrencyfromfirm(Boolean currencyfromfirm) {
    this.currencyfromfirm = currencyfromfirm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Documenttype documenttype = (Documenttype) o;
    return Objects.equals(this.displayname, documenttype.displayname) &&
        Objects.equals(this.id, documenttype.id) &&
        Objects.equals(this.classid, documenttype.classid) &&
        Objects.equals(this.objversion, documenttype.objversion) &&
        Objects.equals(this.code, documenttype.code) &&
        Objects.equals(this.name, documenttype.name) &&
        Objects.equals(this.docqueuecode, documenttype.docqueuecode) &&
        Objects.equals(this.toaccount, documenttype.toaccount) &&
        Objects.equals(this.summaryaccounted, documenttype.summaryaccounted) &&
        Objects.equals(this.accpresetdef, documenttype.accpresetdef) &&
        Objects.equals(this.throughbank, documenttype.throughbank) &&
        Objects.equals(this.paymentkind, documenttype.paymentkind) &&
        Objects.equals(this.reverseaccounting, documenttype.reverseaccounting) &&
        Objects.equals(this.defaultsummaryaccounted, documenttype.defaultsummaryaccounted) &&
        Objects.equals(this.accountcode, documenttype.accountcode) &&
        Objects.equals(this.forceaccounting, documenttype.forceaccounting) &&
        Objects.equals(this.reversedepositaccounting, documenttype.reversedepositaccounting) &&
        Objects.equals(this.currencyfromfirm, documenttype.currencyfromfirm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, code, name, docqueuecode, toaccount, summaryaccounted, accpresetdef, throughbank, paymentkind, reverseaccounting, defaultsummaryaccounted, accountcode, forceaccounting, reversedepositaccounting, currencyfromfirm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Documenttype {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    docqueuecode: ").append(toIndentedString(docqueuecode)).append("\n");
    sb.append("    toaccount: ").append(toIndentedString(toaccount)).append("\n");
    sb.append("    summaryaccounted: ").append(toIndentedString(summaryaccounted)).append("\n");
    sb.append("    accpresetdef: ").append(toIndentedString(accpresetdef)).append("\n");
    sb.append("    throughbank: ").append(toIndentedString(throughbank)).append("\n");
    sb.append("    paymentkind: ").append(toIndentedString(paymentkind)).append("\n");
    sb.append("    reverseaccounting: ").append(toIndentedString(reverseaccounting)).append("\n");
    sb.append("    defaultsummaryaccounted: ").append(toIndentedString(defaultsummaryaccounted)).append("\n");
    sb.append("    accountcode: ").append(toIndentedString(accountcode)).append("\n");
    sb.append("    forceaccounting: ").append(toIndentedString(forceaccounting)).append("\n");
    sb.append("    reversedepositaccounting: ").append(toIndentedString(reversedepositaccounting)).append("\n");
    sb.append("    currencyfromfirm: ").append(toIndentedString(currencyfromfirm)).append("\n");
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

