/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1beta1/write.proto

package com.google.firestore.v1beta1;

public interface WriteOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1beta1.Write)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A document to write.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Document update = 1;</code>
   *
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   *
   *
   * <pre>
   * A document to write.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Document update = 1;</code>
   *
   * @return The update.
   */
  com.google.firestore.v1beta1.Document getUpdate();
  /**
   *
   *
   * <pre>
   * A document to write.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Document update = 1;</code>
   */
  com.google.firestore.v1beta1.DocumentOrBuilder getUpdateOrBuilder();

  /**
   *
   *
   * <pre>
   * A document name to delete. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * </pre>
   *
   * <code>string delete = 2;</code>
   *
   * @return The delete.
   */
  java.lang.String getDelete();
  /**
   *
   *
   * <pre>
   * A document name to delete. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * </pre>
   *
   * <code>string delete = 2;</code>
   *
   * @return The bytes for delete.
   */
  com.google.protobuf.ByteString getDeleteBytes();

  /**
   *
   *
   * <pre>
   * Applies a transformation to a document.
   * At most one `transform` per document is allowed in a given request.
   * An `update` cannot follow a `transform` on the same document in a given
   * request.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.DocumentTransform transform = 6;</code>
   *
   * @return Whether the transform field is set.
   */
  boolean hasTransform();
  /**
   *
   *
   * <pre>
   * Applies a transformation to a document.
   * At most one `transform` per document is allowed in a given request.
   * An `update` cannot follow a `transform` on the same document in a given
   * request.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.DocumentTransform transform = 6;</code>
   *
   * @return The transform.
   */
  com.google.firestore.v1beta1.DocumentTransform getTransform();
  /**
   *
   *
   * <pre>
   * Applies a transformation to a document.
   * At most one `transform` per document is allowed in a given request.
   * An `update` cannot follow a `transform` on the same document in a given
   * request.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.DocumentTransform transform = 6;</code>
   */
  com.google.firestore.v1beta1.DocumentTransformOrBuilder getTransformOrBuilder();

  /**
   *
   *
   * <pre>
   * The fields to update in this write.
   * This field can be set only when the operation is `update`.
   * If the mask is not set for an `update` and the document exists, any
   * existing data will be overwritten.
   * If the mask is set and the document on the server has fields not covered by
   * the mask, they are left unchanged.
   * Fields referenced in the mask, but not present in the input document, are
   * deleted from the document on the server.
   * The field paths in this mask must not contain a reserved field name.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.DocumentMask update_mask = 3;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The fields to update in this write.
   * This field can be set only when the operation is `update`.
   * If the mask is not set for an `update` and the document exists, any
   * existing data will be overwritten.
   * If the mask is set and the document on the server has fields not covered by
   * the mask, they are left unchanged.
   * Fields referenced in the mask, but not present in the input document, are
   * deleted from the document on the server.
   * The field paths in this mask must not contain a reserved field name.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.DocumentMask update_mask = 3;</code>
   *
   * @return The updateMask.
   */
  com.google.firestore.v1beta1.DocumentMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The fields to update in this write.
   * This field can be set only when the operation is `update`.
   * If the mask is not set for an `update` and the document exists, any
   * existing data will be overwritten.
   * If the mask is set and the document on the server has fields not covered by
   * the mask, they are left unchanged.
   * Fields referenced in the mask, but not present in the input document, are
   * deleted from the document on the server.
   * The field paths in this mask must not contain a reserved field name.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.DocumentMask update_mask = 3;</code>
   */
  com.google.firestore.v1beta1.DocumentMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * An optional precondition on the document.
   * The write will fail if this is set and not met by the target document.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Precondition current_document = 4;</code>
   *
   * @return Whether the currentDocument field is set.
   */
  boolean hasCurrentDocument();
  /**
   *
   *
   * <pre>
   * An optional precondition on the document.
   * The write will fail if this is set and not met by the target document.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Precondition current_document = 4;</code>
   *
   * @return The currentDocument.
   */
  com.google.firestore.v1beta1.Precondition getCurrentDocument();
  /**
   *
   *
   * <pre>
   * An optional precondition on the document.
   * The write will fail if this is set and not met by the target document.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Precondition current_document = 4;</code>
   */
  com.google.firestore.v1beta1.PreconditionOrBuilder getCurrentDocumentOrBuilder();

  public com.google.firestore.v1beta1.Write.OperationCase getOperationCase();
}
