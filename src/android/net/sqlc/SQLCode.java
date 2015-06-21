package net.sqlc;

public class SQLCode {
  /* sqlite result codes: */
  public static final int OK        =   0;
  public static final int ERROR     =   1;
  public static final int INTERNAL  =   2;
  public static final int PERM      =   3;
  public static final int ABORT     =   4;
  /* TBD TODO: ... */
  public static final int MISUSE    =  21;
  /* TBD TODO: ... */
  public static final int ROW       = 100;
  public static final int DONE      = 101;
}
