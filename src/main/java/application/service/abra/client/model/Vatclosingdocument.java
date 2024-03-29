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
 * Vatclosingdocument
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Vatclosingdocument   {
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

  @SerializedName("docqueue_id")
  private String docqueueId = null;

  @SerializedName("ordnumber")
  private Integer ordnumber = null;

  @SerializedName("period_id")
  private String periodId = null;

  @SerializedName("documenttype")
  private String documenttype = null;

  @SerializedName("document_id")
  private String documentId = null;

  @SerializedName("isinvatdeclarationreport")
  private Boolean isinvatdeclarationreport = null;

  @SerializedName("isinvatcheckreport")
  private Boolean isinvatcheckreport = null;

  @SerializedName("documentstatus")
  private Integer documentstatus = null;

  @SerializedName("documentstatusastext")
  private String documentstatusastext = null;

  @SerializedName("vatdate$date")
  private DateTime vatdatedate = null;

  public Vatclosingdocument displayname(String displayname) {
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

  public Vatclosingdocument id(String id) {
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

  public Vatclosingdocument classid(String classid) {
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

  public Vatclosingdocument objversion(Integer objversion) {
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

  public Vatclosingdocument parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * uzávěrka; id objektu uzávěrka dph [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "uzávěrka; id objektu uzávěrka dph [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Vatclosingdocument docqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
    return this;
  }

   /**
   * Řada; id objektu Řada dokladů [persistentní položka]
   * @return docqueueId
  **/
  @ApiModelProperty(example = "null", value = "Řada; id objektu Řada dokladů [persistentní položka]")
  public String getDocqueueId() {
    return docqueueId;
  }

  public void setDocqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
  }

  public Vatclosingdocument ordnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
    return this;
  }

   /**
   * pořadové číslo [persistentní položka]
   * @return ordnumber
  **/
  @ApiModelProperty(example = "null", value = "pořadové číslo [persistentní položka]")
  public Integer getOrdnumber() {
    return ordnumber;
  }

  public void setOrdnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
  }

  public Vatclosingdocument periodId(String periodId) {
    this.periodId = periodId;
    return this;
  }

   /**
   * období; id objektu období [persistentní položka]
   * @return periodId
  **/
  @ApiModelProperty(example = "null", value = "období; id objektu období [persistentní položka]")
  public String getPeriodId() {
    return periodId;
  }

  public void setPeriodId(String periodId) {
    this.periodId = periodId;
  }

  public Vatclosingdocument documenttype(String documenttype) {
    this.documenttype = documenttype;
    return this;
  }

   /**
   * typ dokladu [persistentní položka]
   * @return documenttype
  **/
  @ApiModelProperty(example = "null", value = "typ dokladu [persistentní položka]")
  public String getDocumenttype() {
    return documenttype;
  }

  public void setDocumenttype(String documenttype) {
    this.documenttype = documenttype;
  }

  public Vatclosingdocument documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * id dokladu; id objektu dokument [persistentní položka]
   * @return documentId
  **/
  @ApiModelProperty(example = "null", value = "id dokladu; id objektu dokument [persistentní položka]")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public Vatclosingdocument isinvatdeclarationreport(Boolean isinvatdeclarationreport) {
    this.isinvatdeclarationreport = isinvatdeclarationreport;
    return this;
  }

   /**
   * je v dph přiznání [persistentní položka]
   * @return isinvatdeclarationreport
  **/
  @ApiModelProperty(example = "null", value = "je v dph přiznání [persistentní položka]")
  public Boolean getIsinvatdeclarationreport() {
    return isinvatdeclarationreport;
  }

  public void setIsinvatdeclarationreport(Boolean isinvatdeclarationreport) {
    this.isinvatdeclarationreport = isinvatdeclarationreport;
  }

  public Vatclosingdocument isinvatcheckreport(Boolean isinvatcheckreport) {
    this.isinvatcheckreport = isinvatcheckreport;
    return this;
  }

   /**
   * je v kv/kh dph [persistentní položka]
   * @return isinvatcheckreport
  **/
  @ApiModelProperty(example = "null", value = "je v kv/kh dph [persistentní položka]")
  public Boolean getIsinvatcheckreport() {
    return isinvatcheckreport;
  }

  public void setIsinvatcheckreport(Boolean isinvatcheckreport) {
    this.isinvatcheckreport = isinvatcheckreport;
  }

  public Vatclosingdocument documentstatus(Integer documentstatus) {
    this.documentstatus = documentstatus;
    return this;
  }

   /**
   * stav dokumentu [persistentní položka]
   * @return documentstatus
  **/
  @ApiModelProperty(example = "null", value = "stav dokumentu [persistentní položka]")
  public Integer getDocumentstatus() {
    return documentstatus;
  }

  public void setDocumentstatus(Integer documentstatus) {
    this.documentstatus = documentstatus;
  }

  public Vatclosingdocument documentstatusastext(String documentstatusastext) {
    this.documentstatusastext = documentstatusastext;
    return this;
  }

   /**
   * stav dokumentu
   * @return documentstatusastext
  **/
  @ApiModelProperty(example = "null", value = "stav dokumentu")
  public String getDocumentstatusastext() {
    return documentstatusastext;
  }

  public void setDocumentstatusastext(String documentstatusastext) {
    this.documentstatusastext = documentstatusastext;
  }

  public Vatclosingdocument vatdatedate(DateTime vatdatedate) {
    this.vatdatedate = vatdatedate;
    return this;
  }

   /**
   * datum plnění
   * @return vatdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum plnění")
  public DateTime getVatdatedate() {
    return vatdatedate;
  }

  public void setVatdatedate(DateTime vatdatedate) {
    this.vatdatedate = vatdatedate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vatclosingdocument vatclosingdocument = (Vatclosingdocument) o;
    return Objects.equals(this.displayname, vatclosingdocument.displayname) &&
        Objects.equals(this.id, vatclosingdocument.id) &&
        Objects.equals(this.classid, vatclosingdocument.classid) &&
        Objects.equals(this.objversion, vatclosingdocument.objversion) &&
        Objects.equals(this.parentId, vatclosingdocument.parentId) &&
        Objects.equals(this.docqueueId, vatclosingdocument.docqueueId) &&
        Objects.equals(this.ordnumber, vatclosingdocument.ordnumber) &&
        Objects.equals(this.periodId, vatclosingdocument.periodId) &&
        Objects.equals(this.documenttype, vatclosingdocument.documenttype) &&
        Objects.equals(this.documentId, vatclosingdocument.documentId) &&
        Objects.equals(this.isinvatdeclarationreport, vatclosingdocument.isinvatdeclarationreport) &&
        Objects.equals(this.isinvatcheckreport, vatclosingdocument.isinvatcheckreport) &&
        Objects.equals(this.documentstatus, vatclosingdocument.documentstatus) &&
        Objects.equals(this.documentstatusastext, vatclosingdocument.documentstatusastext) &&
        Objects.equals(this.vatdatedate, vatclosingdocument.vatdatedate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, docqueueId, ordnumber, periodId, documenttype, documentId, isinvatdeclarationreport, isinvatcheckreport, documentstatus, documentstatusastext, vatdatedate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vatclosingdocument {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    docqueueId: ").append(toIndentedString(docqueueId)).append("\n");
    sb.append("    ordnumber: ").append(toIndentedString(ordnumber)).append("\n");
    sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
    sb.append("    documenttype: ").append(toIndentedString(documenttype)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    isinvatdeclarationreport: ").append(toIndentedString(isinvatdeclarationreport)).append("\n");
    sb.append("    isinvatcheckreport: ").append(toIndentedString(isinvatcheckreport)).append("\n");
    sb.append("    documentstatus: ").append(toIndentedString(documentstatus)).append("\n");
    sb.append("    documentstatusastext: ").append(toIndentedString(documentstatusastext)).append("\n");
    sb.append("    vatdatedate: ").append(toIndentedString(vatdatedate)).append("\n");
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

