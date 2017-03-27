/**
 * ABRA Gen Web API (spojení testapi)
 * Webové API systému 17.03.03
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
 * Unreliablefirmlogfirm
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Unreliablefirmlogfirm   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Rows")
  private List<Unreliablefirmlogfirmbankaccount> rows = new ArrayList<Unreliablefirmlogfirmbankaccount>();

  @SerializedName("LogDate$DATE")
  private DateTime logDateDATE = null;

  @SerializedName("LogHeader_ID")
  private String logHeaderID = null;

  @SerializedName("Firm_ID")
  private String firmID = null;

  @SerializedName("VATIdentNumber")
  private String vATIdentNumber = null;

  @SerializedName("StatusCode")
  private Integer statusCode = null;

  @SerializedName("StatusFromDate$DATE")
  private DateTime statusFromDateDATE = null;

  @SerializedName("FinancialBureauCode")
  private String financialBureauCode = null;

  @SerializedName("StatusCodeAsText")
  private String statusCodeAsText = null;

   /**
   * Název
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "Název")
  public String getDisplayName() {
    return displayName;
  }

   /**
   * Vlastní ID [persistentní položka]
   * @return ID
  **/
  @ApiModelProperty(example = "null", value = "Vlastní ID [persistentní položka]")
  public String getID() {
    return ID;
  }

   /**
   * ID třídy
   * @return classID
  **/
  @ApiModelProperty(example = "null", value = "ID třídy")
  public String getClassID() {
    return classID;
  }

   /**
   * Verze objektu [persistentní položka]
   * @return objVersion
  **/
  @ApiModelProperty(example = "null", value = "Verze objektu [persistentní položka]")
  public Integer getObjVersion() {
    return objVersion;
  }

  public Unreliablefirmlogfirm rows(List<Unreliablefirmlogfirmbankaccount> rows) {
    this.rows = rows;
    return this;
  }

  public Unreliablefirmlogfirm addRowsItem(Unreliablefirmlogfirmbankaccount rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce BO Kontrola nespolehlivosti plátců DPH - Bankovní účet [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce BO Kontrola nespolehlivosti plátců DPH - Bankovní účet [nepersistentní položka]")
  public List<Unreliablefirmlogfirmbankaccount> getRows() {
    return rows;
  }

  public void setRows(List<Unreliablefirmlogfirmbankaccount> rows) {
    this.rows = rows;
  }

  public Unreliablefirmlogfirm logDateDATE(DateTime logDateDATE) {
    this.logDateDATE = logDateDATE;
    return this;
  }

   /**
   * Datum a čas kontroly [persistentní položka]
   * @return logDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum a čas kontroly [persistentní položka]")
  public DateTime getLogDateDATE() {
    return logDateDATE;
  }

  public void setLogDateDATE(DateTime logDateDATE) {
    this.logDateDATE = logDateDATE;
  }

  public Unreliablefirmlogfirm logHeaderID(String logHeaderID) {
    this.logHeaderID = logHeaderID;
    return this;
  }

   /**
   * Vazba na komunikační protokol; ID objektu Kontrola nespolehlivosti plátců DPH - Protokol [persistentní položka]
   * @return logHeaderID
  **/
  @ApiModelProperty(example = "null", value = "Vazba na komunikační protokol; ID objektu Kontrola nespolehlivosti plátců DPH - Protokol [persistentní položka]")
  public String getLogHeaderID() {
    return logHeaderID;
  }

  public void setLogHeaderID(String logHeaderID) {
    this.logHeaderID = logHeaderID;
  }

  public Unreliablefirmlogfirm firmID(String firmID) {
    this.firmID = firmID;
    return this;
  }

   /**
   * Firma; ID objektu Firma [persistentní položka]
   * @return firmID
  **/
  @ApiModelProperty(example = "null", value = "Firma; ID objektu Firma [persistentní položka]")
  public String getFirmID() {
    return firmID;
  }

  public void setFirmID(String firmID) {
    this.firmID = firmID;
  }

  public Unreliablefirmlogfirm vATIdentNumber(String vATIdentNumber) {
    this.vATIdentNumber = vATIdentNumber;
    return this;
  }

   /**
   * DIČ [persistentní položka]
   * @return vATIdentNumber
  **/
  @ApiModelProperty(example = "null", value = "DIČ [persistentní položka]")
  public String getVATIdentNumber() {
    return vATIdentNumber;
  }

  public void setVATIdentNumber(String vATIdentNumber) {
    this.vATIdentNumber = vATIdentNumber;
  }

  public Unreliablefirmlogfirm statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Kód výsledku kontroly [persistentní položka]
   * @return statusCode
  **/
  @ApiModelProperty(example = "null", value = "Kód výsledku kontroly [persistentní položka]")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public Unreliablefirmlogfirm statusFromDateDATE(DateTime statusFromDateDATE) {
    this.statusFromDateDATE = statusFromDateDATE;
    return this;
  }

   /**
   * Datum, odkdy platí stav [persistentní položka]
   * @return statusFromDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum, odkdy platí stav [persistentní položka]")
  public DateTime getStatusFromDateDATE() {
    return statusFromDateDATE;
  }

  public void setStatusFromDateDATE(DateTime statusFromDateDATE) {
    this.statusFromDateDATE = statusFromDateDATE;
  }

  public Unreliablefirmlogfirm financialBureauCode(String financialBureauCode) {
    this.financialBureauCode = financialBureauCode;
    return this;
  }

   /**
   * Číslo Finančního úřadu [persistentní položka]
   * @return financialBureauCode
  **/
  @ApiModelProperty(example = "null", value = "Číslo Finančního úřadu [persistentní položka]")
  public String getFinancialBureauCode() {
    return financialBureauCode;
  }

  public void setFinancialBureauCode(String financialBureauCode) {
    this.financialBureauCode = financialBureauCode;
  }

  public Unreliablefirmlogfirm statusCodeAsText(String statusCodeAsText) {
    this.statusCodeAsText = statusCodeAsText;
    return this;
  }

   /**
   * Kód výsledku kontroly-text
   * @return statusCodeAsText
  **/
  @ApiModelProperty(example = "null", value = "Kód výsledku kontroly-text")
  public String getStatusCodeAsText() {
    return statusCodeAsText;
  }

  public void setStatusCodeAsText(String statusCodeAsText) {
    this.statusCodeAsText = statusCodeAsText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Unreliablefirmlogfirm unreliablefirmlogfirm = (Unreliablefirmlogfirm) o;
    return Objects.equals(this.displayName, unreliablefirmlogfirm.displayName) &&
        Objects.equals(this.ID, unreliablefirmlogfirm.ID) &&
        Objects.equals(this.classID, unreliablefirmlogfirm.classID) &&
        Objects.equals(this.objVersion, unreliablefirmlogfirm.objVersion) &&
        Objects.equals(this.rows, unreliablefirmlogfirm.rows) &&
        Objects.equals(this.logDateDATE, unreliablefirmlogfirm.logDateDATE) &&
        Objects.equals(this.logHeaderID, unreliablefirmlogfirm.logHeaderID) &&
        Objects.equals(this.firmID, unreliablefirmlogfirm.firmID) &&
        Objects.equals(this.vATIdentNumber, unreliablefirmlogfirm.vATIdentNumber) &&
        Objects.equals(this.statusCode, unreliablefirmlogfirm.statusCode) &&
        Objects.equals(this.statusFromDateDATE, unreliablefirmlogfirm.statusFromDateDATE) &&
        Objects.equals(this.financialBureauCode, unreliablefirmlogfirm.financialBureauCode) &&
        Objects.equals(this.statusCodeAsText, unreliablefirmlogfirm.statusCodeAsText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, rows, logDateDATE, logHeaderID, firmID, vATIdentNumber, statusCode, statusFromDateDATE, financialBureauCode, statusCodeAsText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Unreliablefirmlogfirm {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    logDateDATE: ").append(toIndentedString(logDateDATE)).append("\n");
    sb.append("    logHeaderID: ").append(toIndentedString(logHeaderID)).append("\n");
    sb.append("    firmID: ").append(toIndentedString(firmID)).append("\n");
    sb.append("    vATIdentNumber: ").append(toIndentedString(vATIdentNumber)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusFromDateDATE: ").append(toIndentedString(statusFromDateDATE)).append("\n");
    sb.append("    financialBureauCode: ").append(toIndentedString(financialBureauCode)).append("\n");
    sb.append("    statusCodeAsText: ").append(toIndentedString(statusCodeAsText)).append("\n");
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

