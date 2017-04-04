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
 * Cashdesk
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Cashdesk   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Cashdeskbeginning> rows = new ArrayList<Cashdeskbeginning>();

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("account_id")
  private String accountId = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("currency_id")
  private String currencyId = null;

  @SerializedName("firstopenperiod_id")
  private String firstopenperiodId = null;

  @SerializedName("lastopenperiod_id")
  private String lastopenperiodId = null;

  @SerializedName("firstlocalamount")
  private Double firstlocalamount = null;

  @SerializedName("firstamount")
  private Double firstamount = null;

  @SerializedName("balanceamount")
  private Double balanceamount = null;

  @SerializedName("localbalanceamount")
  private Double localbalanceamount = null;

  public Cashdesk displayname(String displayname) {
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

  public Cashdesk id(String id) {
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

  public Cashdesk classid(String classid) {
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

  public Cashdesk objversion(Integer objversion) {
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

  public Cashdesk rows(List<Cashdeskbeginning> rows) {
    this.rows = rows;
    return this;
  }

  public Cashdesk addRowsItem(Cashdeskbeginning rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * počátky; kolekce bo počátek pokladny [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "počátky; kolekce bo počátek pokladny [nepersistentní položka]")
  public List<Cashdeskbeginning> getRows() {
    return rows;
  }

  public void setRows(List<Cashdeskbeginning> rows) {
    this.rows = rows;
  }

  public Cashdesk hidden(Boolean hidden) {
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

  public Cashdesk name(String name) {
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

  public Cashdesk accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Účet; id objektu Účet účetního rozvrhu [persistentní položka]
   * @return accountId
  **/
  @ApiModelProperty(example = "null", value = "Účet; id objektu Účet účetního rozvrhu [persistentní položka]")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Cashdesk divisionId(String divisionId) {
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

  public Cashdesk currencyId(String currencyId) {
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

  public Cashdesk firstopenperiodId(String firstopenperiodId) {
    this.firstopenperiodId = firstopenperiodId;
    return this;
  }

   /**
   * první období; id objektu období [persistentní položka]
   * @return firstopenperiodId
  **/
  @ApiModelProperty(example = "null", value = "první období; id objektu období [persistentní položka]")
  public String getFirstopenperiodId() {
    return firstopenperiodId;
  }

  public void setFirstopenperiodId(String firstopenperiodId) {
    this.firstopenperiodId = firstopenperiodId;
  }

  public Cashdesk lastopenperiodId(String lastopenperiodId) {
    this.lastopenperiodId = lastopenperiodId;
    return this;
  }

   /**
   * akt.období; id objektu období [persistentní položka]
   * @return lastopenperiodId
  **/
  @ApiModelProperty(example = "null", value = "akt.období; id objektu období [persistentní položka]")
  public String getLastopenperiodId() {
    return lastopenperiodId;
  }

  public void setLastopenperiodId(String lastopenperiodId) {
    this.lastopenperiodId = lastopenperiodId;
  }

  public Cashdesk firstlocalamount(Double firstlocalamount) {
    this.firstlocalamount = firstlocalamount;
    return this;
  }

   /**
   * lokál.částka prvního poč.
   * @return firstlocalamount
  **/
  @ApiModelProperty(example = "null", value = "lokál.částka prvního poč.")
  public Double getFirstlocalamount() {
    return firstlocalamount;
  }

  public void setFirstlocalamount(Double firstlocalamount) {
    this.firstlocalamount = firstlocalamount;
  }

  public Cashdesk firstamount(Double firstamount) {
    this.firstamount = firstamount;
    return this;
  }

   /**
   * Částka prvního poč.
   * @return firstamount
  **/
  @ApiModelProperty(example = "null", value = "Částka prvního poč.")
  public Double getFirstamount() {
    return firstamount;
  }

  public void setFirstamount(Double firstamount) {
    this.firstamount = firstamount;
  }

  public Cashdesk balanceamount(Double balanceamount) {
    this.balanceamount = balanceamount;
    return this;
  }

   /**
   * zůstatek
   * @return balanceamount
  **/
  @ApiModelProperty(example = "null", value = "zůstatek")
  public Double getBalanceamount() {
    return balanceamount;
  }

  public void setBalanceamount(Double balanceamount) {
    this.balanceamount = balanceamount;
  }

  public Cashdesk localbalanceamount(Double localbalanceamount) {
    this.localbalanceamount = localbalanceamount;
    return this;
  }

   /**
   * zůstatek lok.
   * @return localbalanceamount
  **/
  @ApiModelProperty(example = "null", value = "zůstatek lok.")
  public Double getLocalbalanceamount() {
    return localbalanceamount;
  }

  public void setLocalbalanceamount(Double localbalanceamount) {
    this.localbalanceamount = localbalanceamount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cashdesk cashdesk = (Cashdesk) o;
    return Objects.equals(this.displayname, cashdesk.displayname) &&
        Objects.equals(this.id, cashdesk.id) &&
        Objects.equals(this.classid, cashdesk.classid) &&
        Objects.equals(this.objversion, cashdesk.objversion) &&
        Objects.equals(this.rows, cashdesk.rows) &&
        Objects.equals(this.hidden, cashdesk.hidden) &&
        Objects.equals(this.name, cashdesk.name) &&
        Objects.equals(this.accountId, cashdesk.accountId) &&
        Objects.equals(this.divisionId, cashdesk.divisionId) &&
        Objects.equals(this.currencyId, cashdesk.currencyId) &&
        Objects.equals(this.firstopenperiodId, cashdesk.firstopenperiodId) &&
        Objects.equals(this.lastopenperiodId, cashdesk.lastopenperiodId) &&
        Objects.equals(this.firstlocalamount, cashdesk.firstlocalamount) &&
        Objects.equals(this.firstamount, cashdesk.firstamount) &&
        Objects.equals(this.balanceamount, cashdesk.balanceamount) &&
        Objects.equals(this.localbalanceamount, cashdesk.localbalanceamount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, hidden, name, accountId, divisionId, currencyId, firstopenperiodId, lastopenperiodId, firstlocalamount, firstamount, balanceamount, localbalanceamount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cashdesk {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    firstopenperiodId: ").append(toIndentedString(firstopenperiodId)).append("\n");
    sb.append("    lastopenperiodId: ").append(toIndentedString(lastopenperiodId)).append("\n");
    sb.append("    firstlocalamount: ").append(toIndentedString(firstlocalamount)).append("\n");
    sb.append("    firstamount: ").append(toIndentedString(firstamount)).append("\n");
    sb.append("    balanceamount: ").append(toIndentedString(balanceamount)).append("\n");
    sb.append("    localbalanceamount: ").append(toIndentedString(localbalanceamount)).append("\n");
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
