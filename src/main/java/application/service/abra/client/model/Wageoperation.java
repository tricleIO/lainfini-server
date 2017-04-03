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
 * Wageoperation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Wageoperation   {
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

  @SerializedName("opertype_id")
  private String opertypeId = null;

  @SerializedName("charge")
  private Double charge = null;

  @SerializedName("countofunit")
  private Double countofunit = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("operdate$date")
  private DateTime operdatedate = null;

  @SerializedName("importsource_id")
  private String importsourceId = null;

  @SerializedName("importdate$date")
  private DateTime importdatedate = null;

  @SerializedName("operunit")
  private String operunit = null;

  @SerializedName("totalamount")
  private Double totalamount = null;

  @SerializedName("externalcreator")
  private String externalcreator = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  public Wageoperation displayname(String displayname) {
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

  public Wageoperation id(String id) {
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

  public Wageoperation classid(String classid) {
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

  public Wageoperation objversion(Integer objversion) {
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

  public Wageoperation parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu mzdový list dílčí [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu mzdový list dílčí [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Wageoperation opertypeId(String opertypeId) {
    this.opertypeId = opertypeId;
    return this;
  }

   /**
   * typ výkonu; id objektu druhy výkonů [persistentní položka]
   * @return opertypeId
  **/
  @ApiModelProperty(example = "null", value = "typ výkonu; id objektu druhy výkonů [persistentní položka]")
  public String getOpertypeId() {
    return opertypeId;
  }

  public void setOpertypeId(String opertypeId) {
    this.opertypeId = opertypeId;
  }

  public Wageoperation charge(Double charge) {
    this.charge = charge;
    return this;
  }

   /**
   * sazba [persistentní položka]
   * @return charge
  **/
  @ApiModelProperty(example = "null", value = "sazba [persistentní položka]")
  public Double getCharge() {
    return charge;
  }

  public void setCharge(Double charge) {
    this.charge = charge;
  }

  public Wageoperation countofunit(Double countofunit) {
    this.countofunit = countofunit;
    return this;
  }

   /**
   * počet [persistentní položka]
   * @return countofunit
  **/
  @ApiModelProperty(example = "null", value = "počet [persistentní položka]")
  public Double getCountofunit() {
    return countofunit;
  }

  public void setCountofunit(Double countofunit) {
    this.countofunit = countofunit;
  }

  public Wageoperation busorderId(String busorderId) {
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

  public Wageoperation bustransactionId(String bustransactionId) {
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

  public Wageoperation divisionId(String divisionId) {
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

  public Wageoperation operdatedate(DateTime operdatedate) {
    this.operdatedate = operdatedate;
    return this;
  }

   /**
   * datum [persistentní položka]
   * @return operdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum [persistentní položka]")
  public DateTime getOperdatedate() {
    return operdatedate;
  }

  public void setOperdatedate(DateTime operdatedate) {
    this.operdatedate = operdatedate;
  }

  public Wageoperation importsourceId(String importsourceId) {
    this.importsourceId = importsourceId;
    return this;
  }

   /**
   * zdroj importu; id objektu import do výkonů [persistentní položka]
   * @return importsourceId
  **/
  @ApiModelProperty(example = "null", value = "zdroj importu; id objektu import do výkonů [persistentní položka]")
  public String getImportsourceId() {
    return importsourceId;
  }

  public void setImportsourceId(String importsourceId) {
    this.importsourceId = importsourceId;
  }

  public Wageoperation importdatedate(DateTime importdatedate) {
    this.importdatedate = importdatedate;
    return this;
  }

   /**
   * datum importu [persistentní položka]
   * @return importdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum importu [persistentní položka]")
  public DateTime getImportdatedate() {
    return importdatedate;
  }

  public void setImportdatedate(DateTime importdatedate) {
    this.importdatedate = importdatedate;
  }

  public Wageoperation operunit(String operunit) {
    this.operunit = operunit;
    return this;
  }

   /**
   * jednotka
   * @return operunit
  **/
  @ApiModelProperty(example = "null", value = "jednotka")
  public String getOperunit() {
    return operunit;
  }

  public void setOperunit(String operunit) {
    this.operunit = operunit;
  }

  public Wageoperation totalamount(Double totalamount) {
    this.totalamount = totalamount;
    return this;
  }

   /**
   * celková částka
   * @return totalamount
  **/
  @ApiModelProperty(example = "null", value = "celková částka")
  public Double getTotalamount() {
    return totalamount;
  }

  public void setTotalamount(Double totalamount) {
    this.totalamount = totalamount;
  }

  public Wageoperation externalcreator(String externalcreator) {
    this.externalcreator = externalcreator;
    return this;
  }

   /**
   * zdroj importu
   * @return externalcreator
  **/
  @ApiModelProperty(example = "null", value = "zdroj importu")
  public String getExternalcreator() {
    return externalcreator;
  }

  public void setExternalcreator(String externalcreator) {
    this.externalcreator = externalcreator;
  }

  public Wageoperation busprojectId(String busprojectId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wageoperation wageoperation = (Wageoperation) o;
    return Objects.equals(this.displayname, wageoperation.displayname) &&
        Objects.equals(this.id, wageoperation.id) &&
        Objects.equals(this.classid, wageoperation.classid) &&
        Objects.equals(this.objversion, wageoperation.objversion) &&
        Objects.equals(this.parentId, wageoperation.parentId) &&
        Objects.equals(this.opertypeId, wageoperation.opertypeId) &&
        Objects.equals(this.charge, wageoperation.charge) &&
        Objects.equals(this.countofunit, wageoperation.countofunit) &&
        Objects.equals(this.busorderId, wageoperation.busorderId) &&
        Objects.equals(this.bustransactionId, wageoperation.bustransactionId) &&
        Objects.equals(this.divisionId, wageoperation.divisionId) &&
        Objects.equals(this.operdatedate, wageoperation.operdatedate) &&
        Objects.equals(this.importsourceId, wageoperation.importsourceId) &&
        Objects.equals(this.importdatedate, wageoperation.importdatedate) &&
        Objects.equals(this.operunit, wageoperation.operunit) &&
        Objects.equals(this.totalamount, wageoperation.totalamount) &&
        Objects.equals(this.externalcreator, wageoperation.externalcreator) &&
        Objects.equals(this.busprojectId, wageoperation.busprojectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, opertypeId, charge, countofunit, busorderId, bustransactionId, divisionId, operdatedate, importsourceId, importdatedate, operunit, totalamount, externalcreator, busprojectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wageoperation {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    opertypeId: ").append(toIndentedString(opertypeId)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
    sb.append("    countofunit: ").append(toIndentedString(countofunit)).append("\n");
    sb.append("    busorderId: ").append(toIndentedString(busorderId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    operdatedate: ").append(toIndentedString(operdatedate)).append("\n");
    sb.append("    importsourceId: ").append(toIndentedString(importsourceId)).append("\n");
    sb.append("    importdatedate: ").append(toIndentedString(importdatedate)).append("\n");
    sb.append("    operunit: ").append(toIndentedString(operunit)).append("\n");
    sb.append("    totalamount: ").append(toIndentedString(totalamount)).append("\n");
    sb.append("    externalcreator: ").append(toIndentedString(externalcreator)).append("\n");
    sb.append("    busprojectId: ").append(toIndentedString(busprojectId)).append("\n");
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

