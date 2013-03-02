/*
 * @(#)Modifier.java	1.3 06/07/11
 *
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package javax.lang.model.element;


/**
 * Represents a modifier on a program element such
 * as a class, method, or field.
 *
 * <p>Not all modifiers are applicable to all kinds of elements.
 * When two or more modifiers appear in the source code of an element
 * then it is customary, though not required, that they appear in the same
 * order as the constants listed in the detail section below.
 *
 * <p>Note that it is possible additional modifiers will be added in
 * future versions of the platform.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @version 1.3 06/07/11
 * @since 1.6
 */

public enum Modifier {

    // See JLS2 sections 8.1.1, 8.3.1, 8.4.3, 8.8.3, and 9.1.1.
    // java.lang.reflect.Modifier includes INTERFACE, but that's a VMism.

    /** The modifier {@code public} */		PUBLIC,
    /** The modifier {@code protected} */	PROTECTED,
    /** The modifier {@code private} */		PRIVATE,
    /** The modifier {@code abstract} */	ABSTRACT,
    /** The modifier {@code static} */		STATIC,
    /** The modifier {@code final} */		FINAL,
    /** The modifier {@code transient} */	TRANSIENT,
    /** The modifier {@code volatile} */	VOLATILE,
    /** The modifier {@code synchronized} */	SYNCHRONIZED,
    /** The modifier {@code native} */		NATIVE,
    /** The modifier {@code strictfp} */	STRICTFP;


    private String lowercase = null;	// modifier name in lowercase

    /**
     * Returns this modifier's name in lowercase.
     */
    public String toString() {
	if (lowercase == null) {
	   lowercase = name().toLowerCase(java.util.Locale.US); 
	}
	return lowercase;
    }
}
