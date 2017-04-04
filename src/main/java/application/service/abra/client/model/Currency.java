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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Currency
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Currency   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Currencyrow> rows = new ArrayList<Currencyrow>();

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("rounding")
  private Integer rounding = null;

  @SerializedName("values")
  private List<Currencyvalue> values = new ArrayList<Currencyvalue>();

  @SerializedName("bankcode")
  private String bankcode = null;

  @SerializedName("docrounding")
  private Integer docrounding = null;

  @SerializedName("doccashrounding")
  private Integer doccashrounding = null;

  @SerializedName("docvatrounding")
  private Integer docvatrounding = null;

  public Currency displayname(String displayname) {
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

  public Currency id(String id) {
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

  public Currency classid(String classid) {
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

  public Currency objversion(Integer objversion) {
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

  public Currency rows(List<Currencyrow> rows) {
    this.rows = rows;
    return this;
  }

  public Currency addRowsItem(Currencyrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * historie; kolekce bo měna - historie [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "historie; kolekce bo měna - historie [nepersistentní položka]")
  public List<Currencyrow> getRows() {
    return rows;
  }

  public void setRows(List<Currencyrow> rows) {
    this.rows = rows;
  }

  public Currency hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * skrytý [persistentní položka]
   * @return hidden
  **/
  @ApiModelProperty(example = "null", value = "skrytý [persistentní položka]")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public Currency code(String code) {
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

  public Currency name(String name) {
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

  public Currency symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * zkratka [persistentní položka]
   * @return symbol
  **/
  @ApiModelProperty(example = "null", value = "zkratka [persistentní položka]")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Currency rounding(Integer rounding) {
    this.rounding = rounding;
    return this;
  }

   /**
   * zaokrouhlení [persistentní položka]
   * @return rounding
  **/
  @ApiModelProperty(example = "null", value = "zaokrouhlení [persistentní položka]")
  public Integer getRounding() {
    return rounding;
  }

  public void setRounding(Integer rounding) {
    this.rounding = rounding;
  }

  public Currency values(List<Currencyvalue> values) {
    this.values = values;
    return this;
  }

  public Currency addValuesItem(Currencyvalue valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * hodnoty; kolekce bo měna - hodnota [nepersistentní položka]
   * @return values
  **/
  @ApiModelProperty(example = "null", value = "hodnoty; kolekce bo měna - hodnota [nepersistentní položka]")
  public List<Currencyvalue> getValues() {
    return values;
  }

  public void setValues(List<Currencyvalue> values) {
    this.values = values;
  }

  public Currency bankcode(String bankcode) {
    this.bankcode = bankcode;
    return this;
  }

   /**
   * bank.kód [persistentní položka]
   * @return bankcode
  **/
  @ApiModelProperty(example = "null", value = "bank.kód [persistentní položka]")
  public String getBankcode() {
    return bankcode;
  }

  public void setBankcode(String bankcode) {
    this.bankcode = bankcode;
  }

  public Currency docrounding(Integer docrounding) {
    this.docrounding = docrounding;
    return this;
  }

   /**
   * zaokrouhlení dokladů [persistentní položka]
   * @return docrounding
  **/
  @ApiModelProperty(example = "null", value = "zaokrouhlení dokladů [persistentní položka]")
  public Integer getDocrounding() {
    return docrounding;
  }

  public void setDocrounding(Integer docrounding) {
    this.docrounding = docrounding;
  }

  public Currency doccashrounding(Integer doccashrounding) {
    this.doccashrounding = doccashrounding;
    return this;
  }

   /**
   * zaokrouhlení pokl. dokladů [persistentní položka]
   * @return doccashrounding
  **/
  @ApiModelProperty(example = "null", value = "zaokrouhlení pokl. dokladů [persistentní položka]")
  public Integer getDoccashrounding() {
    return doccashrounding;
  }

  public void setDoccashrounding(Integer doccashrounding) {
    this.doccashrounding = doccashrounding;
  }

  public Currency docvatrounding(Integer docvatrounding) {
    this.docvatrounding = docvatrounding;
    return this;
  }

   /**
   * zaokrouhlení dph dokladů [persistentní položka]
   * @return docvatrounding
  **/
  @ApiModelProperty(example = "null", value = "zaokrouhlení dph dokladů [persistentní položka]")
  public Integer getDocvatrounding() {
    return docvatrounding;
  }

  public void setDocvatrounding(Integer docvatrounding) {
    this.docvatrounding = docvatrounding;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Currency currency = (Currency) o;
    return Objects.equals(this.displayname, currency.displayname) &&
        Objects.equals(this.id, currency.id) &&
        Objects.equals(this.classid, currency.classid) &&
        Objects.equals(this.objversion, currency.objversion) &&
        Objects.equals(this.rows, currency.rows) &&
        Objects.equals(this.hidden, currency.hidden) &&
        Objects.equals(this.code, currency.code) &&
        Objects.equals(this.name, currency.name) &&
        Objects.equals(this.symbol, currency.symbol) &&
        Objects.equals(this.rounding, currency.rounding) &&
        Objects.equals(this.values, currency.values) &&
        Objects.equals(this.bankcode, currency.bankcode) &&
        Objects.equals(this.docrounding, currency.docrounding) &&
        Objects.equals(this.doccashrounding, currency.doccashrounding) &&
        Objects.equals(this.docvatrounding, currency.docvatrounding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, hidden, code, name, symbol, rounding, values, bankcode, docrounding, doccashrounding, docvatrounding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currency {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    rounding: ").append(toIndentedString(rounding)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    bankcode: ").append(toIndentedString(bankcode)).append("\n");
    sb.append("    docrounding: ").append(toIndentedString(docrounding)).append("\n");
    sb.append("    doccashrounding: ").append(toIndentedString(doccashrounding)).append("\n");
    sb.append("    docvatrounding: ").append(toIndentedString(docvatrounding)).append("\n");
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
