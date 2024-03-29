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
 * Docconfirmation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Docconfirmation   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Docconfirmationrow> rows = new ArrayList<Docconfirmationrow>();

  @SerializedName("doctype")
  private String doctype = null;

  @SerializedName("document_id")
  private String documentId = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("starteddate$date")
  private DateTime starteddatedate = null;

  @SerializedName("confirmationstate")
  private Integer confirmationstate = null;

  @SerializedName("actualconfirmationround")
  private Integer actualconfirmationround = null;

  @SerializedName("finisheddate$date")
  private DateTime finisheddatedate = null;

  @SerializedName("confirmationstatedesc")
  private String confirmationstatedesc = null;

  @SerializedName("finishedby_id")
  private String finishedbyId = null;

  public Docconfirmation displayname(String displayname) {
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

  public Docconfirmation id(String id) {
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

  public Docconfirmation classid(String classid) {
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

  public Docconfirmation objversion(Integer objversion) {
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

  public Docconfirmation rows(List<Docconfirmationrow> rows) {
    this.rows = rows;
    return this;
  }

  public Docconfirmation addRowsItem(Docconfirmationrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo schvalování dokladu - řádek [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo schvalování dokladu - řádek [nepersistentní položka]")
  public List<Docconfirmationrow> getRows() {
    return rows;
  }

  public void setRows(List<Docconfirmationrow> rows) {
    this.rows = rows;
  }

  public Docconfirmation doctype(String doctype) {
    this.doctype = doctype;
    return this;
  }

   /**
   * typ dokladu [persistentní položka]
   * @return doctype
  **/
  @ApiModelProperty(example = "null", value = "typ dokladu [persistentní položka]")
  public String getDoctype() {
    return doctype;
  }

  public void setDoctype(String doctype) {
    this.doctype = doctype;
  }

  public Docconfirmation documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * id schvalovaného dokladu; id objektu dokument [persistentní položka]
   * @return documentId
  **/
  @ApiModelProperty(example = "null", value = "id schvalovaného dokladu; id objektu dokument [persistentní položka]")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public Docconfirmation createdbyId(String createdbyId) {
    this.createdbyId = createdbyId;
    return this;
  }

   /**
   * schválení vyžádal; id objektu uživatel [persistentní položka]
   * @return createdbyId
  **/
  @ApiModelProperty(example = "null", value = "schválení vyžádal; id objektu uživatel [persistentní položka]")
  public String getCreatedbyId() {
    return createdbyId;
  }

  public void setCreatedbyId(String createdbyId) {
    this.createdbyId = createdbyId;
  }

  public Docconfirmation starteddatedate(DateTime starteddatedate) {
    this.starteddatedate = starteddatedate;
    return this;
  }

   /**
   * schvalování započato [persistentní položka]
   * @return starteddatedate
  **/
  @ApiModelProperty(example = "null", value = "schvalování započato [persistentní položka]")
  public DateTime getStarteddatedate() {
    return starteddatedate;
  }

  public void setStarteddatedate(DateTime starteddatedate) {
    this.starteddatedate = starteddatedate;
  }

  public Docconfirmation confirmationstate(Integer confirmationstate) {
    this.confirmationstate = confirmationstate;
    return this;
  }

   /**
   * aktuální stav schvalování dokladu [persistentní položka]
   * @return confirmationstate
  **/
  @ApiModelProperty(example = "null", value = "aktuální stav schvalování dokladu [persistentní položka]")
  public Integer getConfirmationstate() {
    return confirmationstate;
  }

  public void setConfirmationstate(Integer confirmationstate) {
    this.confirmationstate = confirmationstate;
  }

  public Docconfirmation actualconfirmationround(Integer actualconfirmationround) {
    this.actualconfirmationround = actualconfirmationround;
    return this;
  }

   /**
   * kolo [persistentní položka]
   * @return actualconfirmationround
  **/
  @ApiModelProperty(example = "null", value = "kolo [persistentní položka]")
  public Integer getActualconfirmationround() {
    return actualconfirmationround;
  }

  public void setActualconfirmationround(Integer actualconfirmationround) {
    this.actualconfirmationround = actualconfirmationround;
  }

  public Docconfirmation finisheddatedate(DateTime finisheddatedate) {
    this.finisheddatedate = finisheddatedate;
    return this;
  }

   /**
   * schvalování dokončeno [persistentní položka]
   * @return finisheddatedate
  **/
  @ApiModelProperty(example = "null", value = "schvalování dokončeno [persistentní položka]")
  public DateTime getFinisheddatedate() {
    return finisheddatedate;
  }

  public void setFinisheddatedate(DateTime finisheddatedate) {
    this.finisheddatedate = finisheddatedate;
  }

  public Docconfirmation confirmationstatedesc(String confirmationstatedesc) {
    this.confirmationstatedesc = confirmationstatedesc;
    return this;
  }

   /**
   * aktuální stav schvalování dokladu
   * @return confirmationstatedesc
  **/
  @ApiModelProperty(example = "null", value = "aktuální stav schvalování dokladu")
  public String getConfirmationstatedesc() {
    return confirmationstatedesc;
  }

  public void setConfirmationstatedesc(String confirmationstatedesc) {
    this.confirmationstatedesc = confirmationstatedesc;
  }

  public Docconfirmation finishedbyId(String finishedbyId) {
    this.finishedbyId = finishedbyId;
    return this;
  }

   /**
   * schvalování ukončil; id objektu uživatel [persistentní položka]
   * @return finishedbyId
  **/
  @ApiModelProperty(example = "null", value = "schvalování ukončil; id objektu uživatel [persistentní položka]")
  public String getFinishedbyId() {
    return finishedbyId;
  }

  public void setFinishedbyId(String finishedbyId) {
    this.finishedbyId = finishedbyId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Docconfirmation docconfirmation = (Docconfirmation) o;
    return Objects.equals(this.displayname, docconfirmation.displayname) &&
        Objects.equals(this.id, docconfirmation.id) &&
        Objects.equals(this.classid, docconfirmation.classid) &&
        Objects.equals(this.objversion, docconfirmation.objversion) &&
        Objects.equals(this.rows, docconfirmation.rows) &&
        Objects.equals(this.doctype, docconfirmation.doctype) &&
        Objects.equals(this.documentId, docconfirmation.documentId) &&
        Objects.equals(this.createdbyId, docconfirmation.createdbyId) &&
        Objects.equals(this.starteddatedate, docconfirmation.starteddatedate) &&
        Objects.equals(this.confirmationstate, docconfirmation.confirmationstate) &&
        Objects.equals(this.actualconfirmationround, docconfirmation.actualconfirmationround) &&
        Objects.equals(this.finisheddatedate, docconfirmation.finisheddatedate) &&
        Objects.equals(this.confirmationstatedesc, docconfirmation.confirmationstatedesc) &&
        Objects.equals(this.finishedbyId, docconfirmation.finishedbyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, doctype, documentId, createdbyId, starteddatedate, confirmationstate, actualconfirmationround, finisheddatedate, confirmationstatedesc, finishedbyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Docconfirmation {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    doctype: ").append(toIndentedString(doctype)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    starteddatedate: ").append(toIndentedString(starteddatedate)).append("\n");
    sb.append("    confirmationstate: ").append(toIndentedString(confirmationstate)).append("\n");
    sb.append("    actualconfirmationround: ").append(toIndentedString(actualconfirmationround)).append("\n");
    sb.append("    finisheddatedate: ").append(toIndentedString(finisheddatedate)).append("\n");
    sb.append("    confirmationstatedesc: ").append(toIndentedString(confirmationstatedesc)).append("\n");
    sb.append("    finishedbyId: ").append(toIndentedString(finishedbyId)).append("\n");
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

