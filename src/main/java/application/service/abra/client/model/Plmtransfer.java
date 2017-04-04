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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Plmtransfer
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Plmtransfer   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Plmtransfersrow> rows = new ArrayList<Plmtransfersrow>();

  @SerializedName("transferdate$date")
  private DateTime transferdatedate = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("wageperiod_id")
  private String wageperiodId = null;

  @SerializedName("wageoperationimport_id")
  private String wageoperationimportId = null;

  public Plmtransfer displayname(String displayname) {
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

  public Plmtransfer id(String id) {
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

  public Plmtransfer classid(String classid) {
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

  public Plmtransfer objversion(Integer objversion) {
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

  public Plmtransfer rows(List<Plmtransfersrow> rows) {
    this.rows = rows;
    return this;
  }

  public Plmtransfer addRowsItem(Plmtransfersrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo Řádek přenosu pracovních lístků do mezd [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo Řádek přenosu pracovních lístků do mezd [nepersistentní položka]")
  public List<Plmtransfersrow> getRows() {
    return rows;
  }

  public void setRows(List<Plmtransfersrow> rows) {
    this.rows = rows;
  }

  public Plmtransfer transferdatedate(DateTime transferdatedate) {
    this.transferdatedate = transferdatedate;
    return this;
  }

   /**
   * datum přenosu [persistentní položka]
   * @return transferdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum přenosu [persistentní položka]")
  public DateTime getTransferdatedate() {
    return transferdatedate;
  }

  public void setTransferdatedate(DateTime transferdatedate) {
    this.transferdatedate = transferdatedate;
  }

  public Plmtransfer createdbyId(String createdbyId) {
    this.createdbyId = createdbyId;
    return this;
  }

   /**
   * přenos vytvořil; id objektu uživatel [persistentní položka]
   * @return createdbyId
  **/
  @ApiModelProperty(example = "null", value = "přenos vytvořil; id objektu uživatel [persistentní položka]")
  public String getCreatedbyId() {
    return createdbyId;
  }

  public void setCreatedbyId(String createdbyId) {
    this.createdbyId = createdbyId;
  }

  public Plmtransfer description(String description) {
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

  public Plmtransfer wageperiodId(String wageperiodId) {
    this.wageperiodId = wageperiodId;
    return this;
  }

   /**
   * mzdové období; id objektu mzdové období [persistentní položka]
   * @return wageperiodId
  **/
  @ApiModelProperty(example = "null", value = "mzdové období; id objektu mzdové období [persistentní položka]")
  public String getWageperiodId() {
    return wageperiodId;
  }

  public void setWageperiodId(String wageperiodId) {
    this.wageperiodId = wageperiodId;
  }

  public Plmtransfer wageoperationimportId(String wageoperationimportId) {
    this.wageoperationimportId = wageoperationimportId;
    return this;
  }

   /**
   * import do výkonů; id objektu import do výkonů [persistentní položka]
   * @return wageoperationimportId
  **/
  @ApiModelProperty(example = "null", value = "import do výkonů; id objektu import do výkonů [persistentní položka]")
  public String getWageoperationimportId() {
    return wageoperationimportId;
  }

  public void setWageoperationimportId(String wageoperationimportId) {
    this.wageoperationimportId = wageoperationimportId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plmtransfer plmtransfer = (Plmtransfer) o;
    return Objects.equals(this.displayname, plmtransfer.displayname) &&
        Objects.equals(this.id, plmtransfer.id) &&
        Objects.equals(this.classid, plmtransfer.classid) &&
        Objects.equals(this.objversion, plmtransfer.objversion) &&
        Objects.equals(this.rows, plmtransfer.rows) &&
        Objects.equals(this.transferdatedate, plmtransfer.transferdatedate) &&
        Objects.equals(this.createdbyId, plmtransfer.createdbyId) &&
        Objects.equals(this.description, plmtransfer.description) &&
        Objects.equals(this.wageperiodId, plmtransfer.wageperiodId) &&
        Objects.equals(this.wageoperationimportId, plmtransfer.wageoperationimportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, transferdatedate, createdbyId, description, wageperiodId, wageoperationimportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plmtransfer {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    transferdatedate: ").append(toIndentedString(transferdatedate)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    wageperiodId: ").append(toIndentedString(wageperiodId)).append("\n");
    sb.append("    wageoperationimportId: ").append(toIndentedString(wageoperationimportId)).append("\n");
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
