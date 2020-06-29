package com.google.sps.data;

/** A comment on a the history list. */
public final class Comment {

  private final long id;
  private final String text;
  private final long creationTime;

  public Comment(long id, String text, long creationTime) {
    this.id = id;
    this.text = text;
    this.creationTime = creationTime;
  }
}