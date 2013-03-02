/*
 * @(#)file      JDMTrapInterestedHost.java
 * @(#)author    Sun Microsystems, Inc.
 * @(#)version   4.8
 * @(#)date      08/11/10
 *
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */


/* Generated By:JJTree: Do not edit this line. JDMTrapInterestedHost.java */

package com.sun.jmx.snmp.IPAcl;

/** 
 * @version     4.8     11/17/05 
 * @author      Sun Microsystems, Inc. 
 */ 
class JDMTrapInterestedHost extends SimpleNode {
  JDMTrapInterestedHost(int id) {
    super(id);
  }

  JDMTrapInterestedHost(Parser p, int id) {
    super(p, id);
  }

  public static Node jjtCreate(int id) {
      return new JDMTrapInterestedHost(id);
  }

  public static Node jjtCreate(Parser p, int id) {
      return new JDMTrapInterestedHost(p, id);
  }
}
