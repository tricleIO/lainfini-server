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
 * Servicedocumentdoc
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Servicedocumentdoc   {
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

  @SerializedName("doctype")
  private String doctype = null;

  @SerializedName("subtype")
  private Integer subtype = null;

  @SerializedName("storedoc_id")
  private String storedocId = null;

  @SerializedName("document_id")
  private String documentId = null;

  @SerializedName("isgroupinvoice")
  private Boolean isgroupinvoice = null;

  @SerializedName("rangedatefrom")
  private DateTime rangedatefrom = null;

  @SerializedName("rangedateto")
  private DateTime rangedateto = null;

  public Servicedocumentdoc displayname(String displayname) {
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

  public Servicedocumentdoc id(String id) {
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

  public Servicedocumentdoc classid(String classid) {
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

  public Servicedocumentdoc objversion(Integer objversion) {
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

  public Servicedocumentdoc parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu servisní list [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu servisní list [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Servicedocumentdoc doctype(String doctype) {
    this.doctype = doctype;
    return this;
  }

   /**
   * typ [persistentní položka]
   * @return doctype
  **/
  @ApiModelProperty(example = "null", value = "typ [persistentní položka]")
  public String getDoctype() {
    return doctype;
  }

  public void setDoctype(String doctype) {
    this.doctype = doctype;
  }

  public Servicedocumentdoc subtype(Integer subtype) {
    this.subtype = subtype;
    return this;
  }

   /**
   * subtyp dokladu [persistentní položka]
   * @return subtype
  **/
  @ApiModelProperty(example = "null", value = "subtyp dokladu [persistentní položka]")
  public Integer getSubtype() {
    return subtype;
  }

  public void setSubtype(Integer subtype) {
    this.subtype = subtype;
  }

  public Servicedocumentdoc storedocId(String storedocId) {
    this.storedocId = storedocId;
    return this;
  }

   /**
   * skladový doklad; id objektu skladový doklad [persistentní položka]
   * @return storedocId
  **/
  @ApiModelProperty(example = "null", value = "skladový doklad; id objektu skladový doklad [persistentní položka]")
  public String getStoredocId() {
    return storedocId;
  }

  public void setStoredocId(String storedocId) {
    this.storedocId = storedocId;
  }

  public Servicedocumentdoc documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * doklad; id objektu dokument [persistentní položka]
   * @return documentId
  **/
  @ApiModelProperty(example = "null", value = "doklad; id objektu dokument [persistentní položka]")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public Servicedocumentdoc isgroupinvoice(Boolean isgroupinvoice) {
    this.isgroupinvoice = isgroupinvoice;
    return this;
  }

   /**
   * hromadná [persistentní položka]
   * @return isgroupinvoice
  **/
  @ApiModelProperty(example = "null", value = "hromadná [persistentní položka]")
  public Boolean getIsgroupinvoice() {
    return isgroupinvoice;
  }

  public void setIsgroupinvoice(Boolean isgroupinvoice) {
    this.isgroupinvoice = isgroupinvoice;
  }

  public Servicedocumentdoc rangedatefrom(DateTime rangedatefrom) {
    this.rangedatefrom = rangedatefrom;
    return this;
  }

   /**
   * datum od [persistentní položka]
   * @return rangedatefrom
  **/
  @ApiModelProperty(example = "null", value = "datum od [persistentní položka]")
  public DateTime getRangedatefrom() {
    return rangedatefrom;
  }

  public void setRangedatefrom(DateTime rangedatefrom) {
    this.rangedatefrom = rangedatefrom;
  }

  public Servicedocumentdoc rangedateto(DateTime rangedateto) {
    this.rangedateto = rangedateto;
    return this;
  }

   /**
   * datum do [persistentní položka]
   * @return rangedateto
  **/
  @ApiModelProperty(example = "null", value = "datum do [persistentní položka]")
  public DateTime getRangedateto() {
    return rangedateto;
  }

  public void setRangedateto(DateTime rangedateto) {
    this.rangedateto = rangedateto;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Servicedocumentdoc servicedocumentdoc = (Servicedocumentdoc) o;
    return Objects.equals(this.displayname, servicedocumentdoc.displayname) &&
        Objects.equals(this.id, servicedocumentdoc.id) &&
        Objects.equals(this.classid, servicedocumentdoc.classid) &&
        Objects.equals(this.objversion, servicedocumentdoc.objversion) &&
        Objects.equals(this.parentId, servicedocumentdoc.parentId) &&
        Objects.equals(this.doctype, servicedocumentdoc.doctype) &&
        Objects.equals(this.subtype, servicedocumentdoc.subtype) &&
        Objects.equals(this.storedocId, servicedocumentdoc.storedocId) &&
        Objects.equals(this.documentId, servicedocumentdoc.documentId) &&
        Objects.equals(this.isgroupinvoice, servicedocumentdoc.isgroupinvoice) &&
        Objects.equals(this.rangedatefrom, servicedocumentdoc.rangedatefrom) &&
        Objects.equals(this.rangedateto, servicedocumentdoc.rangedateto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, doctype, subtype, storedocId, documentId, isgroupinvoice, rangedatefrom, rangedateto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Servicedocumentdoc {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    doctype: ").append(toIndentedString(doctype)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    storedocId: ").append(toIndentedString(storedocId)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    isgroupinvoice: ").append(toIndentedString(isgroupinvoice)).append("\n");
    sb.append("    rangedatefrom: ").append(toIndentedString(rangedatefrom)).append("\n");
    sb.append("    rangedateto: ").append(toIndentedString(rangedateto)).append("\n");
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

