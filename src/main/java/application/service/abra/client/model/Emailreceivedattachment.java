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
 * Emailreceivedattachment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Emailreceivedattachment   {
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

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("filesize")
  private Integer filesize = null;

  @SerializedName("document_id")
  private String documentId = null;

  @SerializedName("blobdata")
  private byte[] blobdata = null;

  @SerializedName("mimepos")
  private String mimepos = null;

  @SerializedName("content_id")
  private Emailreceivedattachment contentId = null;

  public Emailreceivedattachment displayname(String displayname) {
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

  public Emailreceivedattachment id(String id) {
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

  public Emailreceivedattachment classid(String classid) {
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

  public Emailreceivedattachment objversion(Integer objversion) {
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

  public Emailreceivedattachment parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu hlavičkový objekt [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu hlavičkový objekt [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Emailreceivedattachment filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * název souboru [persistentní položka]
   * @return filename
  **/
  @ApiModelProperty(example = "null", value = "název souboru [persistentní položka]")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public Emailreceivedattachment filesize(Integer filesize) {
    this.filesize = filesize;
    return this;
  }

   /**
   * velikost (b) [persistentní položka]
   * @return filesize
  **/
  @ApiModelProperty(example = "null", value = "velikost (b) [persistentní položka]")
  public Integer getFilesize() {
    return filesize;
  }

  public void setFilesize(Integer filesize) {
    this.filesize = filesize;
  }

  public Emailreceivedattachment documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * zpracovaný dokument; id objektu dokument [persistentní položka]
   * @return documentId
  **/
  @ApiModelProperty(example = "null", value = "zpracovaný dokument; id objektu dokument [persistentní položka]")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public Emailreceivedattachment blobdata(byte[] blobdata) {
    this.blobdata = blobdata;
    return this;
  }

   /**
   * obsah
   * @return blobdata
  **/
  @ApiModelProperty(example = "null", value = "obsah")
  public byte[] getBlobdata() {
    return blobdata;
  }

  public void setBlobdata(byte[] blobdata) {
    this.blobdata = blobdata;
  }

  public Emailreceivedattachment mimepos(String mimepos) {
    this.mimepos = mimepos;
    return this;
  }

   /**
   * identifikace přílohy [persistentní položka]
   * @return mimepos
  **/
  @ApiModelProperty(example = "null", value = "identifikace přílohy [persistentní položka]")
  public String getMimepos() {
    return mimepos;
  }

  public void setMimepos(String mimepos) {
    this.mimepos = mimepos;
  }

  public Emailreceivedattachment contentId(Emailreceivedattachment contentId) {
    this.contentId = contentId;
    return this;
  }

   /**
   * Get contentId
   * @return contentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Emailreceivedattachment getContentId() {
    return contentId;
  }

  public void setContentId(Emailreceivedattachment contentId) {
    this.contentId = contentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emailreceivedattachment emailreceivedattachment = (Emailreceivedattachment) o;
    return Objects.equals(this.displayname, emailreceivedattachment.displayname) &&
        Objects.equals(this.id, emailreceivedattachment.id) &&
        Objects.equals(this.classid, emailreceivedattachment.classid) &&
        Objects.equals(this.objversion, emailreceivedattachment.objversion) &&
        Objects.equals(this.parentId, emailreceivedattachment.parentId) &&
        Objects.equals(this.filename, emailreceivedattachment.filename) &&
        Objects.equals(this.filesize, emailreceivedattachment.filesize) &&
        Objects.equals(this.documentId, emailreceivedattachment.documentId) &&
        Objects.equals(this.blobdata, emailreceivedattachment.blobdata) &&
        Objects.equals(this.mimepos, emailreceivedattachment.mimepos) &&
        Objects.equals(this.contentId, emailreceivedattachment.contentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, filename, filesize, documentId, blobdata, mimepos, contentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emailreceivedattachment {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    filesize: ").append(toIndentedString(filesize)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    blobdata: ").append(toIndentedString(blobdata)).append("\n");
    sb.append("    mimepos: ").append(toIndentedString(mimepos)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
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
