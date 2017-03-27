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

import java.util.Objects;


/**
 * Emailreceivedattachment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Emailreceivedattachment   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Parent_ID")
  private String parentID = null;

  @SerializedName("FileName")
  private String fileName = null;

  @SerializedName("FileSize")
  private Integer fileSize = null;

  @SerializedName("Document_ID")
  private String documentID = null;

  @SerializedName("BlobData")
  private byte[] blobData = null;

  @SerializedName("MimePos")
  private String mimePos = null;

  @SerializedName("Content_ID")
  private Emailreceivedattachment contentID = null;

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

   /**
   * Vlastník; ID objektu Hlavičkový objekt [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Hlavičkový objekt [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Emailreceivedattachment fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Název souboru [persistentní položka]
   * @return fileName
  **/
  @ApiModelProperty(example = "null", value = "Název souboru [persistentní položka]")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Emailreceivedattachment fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Velikost (B) [persistentní položka]
   * @return fileSize
  **/
  @ApiModelProperty(example = "null", value = "Velikost (B) [persistentní položka]")
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  public Emailreceivedattachment documentID(String documentID) {
    this.documentID = documentID;
    return this;
  }

   /**
   * Zpracovaný dokument; ID objektu Dokument [persistentní položka]
   * @return documentID
  **/
  @ApiModelProperty(example = "null", value = "Zpracovaný dokument; ID objektu Dokument [persistentní položka]")
  public String getDocumentID() {
    return documentID;
  }

  public void setDocumentID(String documentID) {
    this.documentID = documentID;
  }

   /**
   * Obsah
   * @return blobData
  **/
  @ApiModelProperty(example = "null", value = "Obsah")
  public byte[] getBlobData() {
    return blobData;
  }

  public Emailreceivedattachment mimePos(String mimePos) {
    this.mimePos = mimePos;
    return this;
  }

   /**
   * Identifikace přílohy [persistentní položka]
   * @return mimePos
  **/
  @ApiModelProperty(example = "null", value = "Identifikace přílohy [persistentní položka]")
  public String getMimePos() {
    return mimePos;
  }

  public void setMimePos(String mimePos) {
    this.mimePos = mimePos;
  }

  public Emailreceivedattachment contentID(Emailreceivedattachment contentID) {
    this.contentID = contentID;
    return this;
  }

   /**
   * Get contentID
   * @return contentID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Emailreceivedattachment getContentID() {
    return contentID;
  }

  public void setContentID(Emailreceivedattachment contentID) {
    this.contentID = contentID;
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
    return Objects.equals(this.displayName, emailreceivedattachment.displayName) &&
        Objects.equals(this.ID, emailreceivedattachment.ID) &&
        Objects.equals(this.classID, emailreceivedattachment.classID) &&
        Objects.equals(this.objVersion, emailreceivedattachment.objVersion) &&
        Objects.equals(this.parentID, emailreceivedattachment.parentID) &&
        Objects.equals(this.fileName, emailreceivedattachment.fileName) &&
        Objects.equals(this.fileSize, emailreceivedattachment.fileSize) &&
        Objects.equals(this.documentID, emailreceivedattachment.documentID) &&
        Objects.equals(this.blobData, emailreceivedattachment.blobData) &&
        Objects.equals(this.mimePos, emailreceivedattachment.mimePos) &&
        Objects.equals(this.contentID, emailreceivedattachment.contentID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, fileName, fileSize, documentID, blobData, mimePos, contentID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emailreceivedattachment {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    documentID: ").append(toIndentedString(documentID)).append("\n");
    sb.append("    blobData: ").append(toIndentedString(blobData)).append("\n");
    sb.append("    mimePos: ").append(toIndentedString(mimePos)).append("\n");
    sb.append("    contentID: ").append(toIndentedString(contentID)).append("\n");
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

