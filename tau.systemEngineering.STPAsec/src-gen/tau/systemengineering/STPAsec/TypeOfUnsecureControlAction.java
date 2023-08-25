/**
 */
package tau.systemengineering.STPAsec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Of Unsecure Control Action</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getTypeOfUnsecureControlAction()
 * @model
 * @generated
 */
public enum TypeOfUnsecureControlAction implements Enumerator {
	/**
	 * The '<em><b>Not Provided</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_PROVIDED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_PROVIDED(0, "NotProvided", "NotProvided"),

	/**
	 * The '<em><b>Providing Causes Hazard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVIDING_CAUSES_HAZARD_VALUE
	 * @generated
	 * @ordered
	 */
	PROVIDING_CAUSES_HAZARD(1, "ProvidingCausesHazard", "ProvidingCausesHazard"),

	/**
	 * The '<em><b>To Early To Late</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_EARLY_TO_LATE_VALUE
	 * @generated
	 * @ordered
	 */
	TO_EARLY_TO_LATE(2, "ToEarlyToLate", "ToEarlyToLate"),

	/**
	 * The '<em><b>Stop Too Soon Applied To Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_TOO_SOON_APPLIED_TO_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	STOP_TOO_SOON_APPLIED_TO_LONG(3, "StopTooSoonAppliedToLong", "StopTooSoonAppliedToLong");

	/**
	 * The '<em><b>Not Provided</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_PROVIDED
	 * @model name="NotProvided"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_PROVIDED_VALUE = 0;

	/**
	 * The '<em><b>Providing Causes Hazard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVIDING_CAUSES_HAZARD
	 * @model name="ProvidingCausesHazard"
	 * @generated
	 * @ordered
	 */
	public static final int PROVIDING_CAUSES_HAZARD_VALUE = 1;

	/**
	 * The '<em><b>To Early To Late</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_EARLY_TO_LATE
	 * @model name="ToEarlyToLate"
	 * @generated
	 * @ordered
	 */
	public static final int TO_EARLY_TO_LATE_VALUE = 2;

	/**
	 * The '<em><b>Stop Too Soon Applied To Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_TOO_SOON_APPLIED_TO_LONG
	 * @model name="StopTooSoonAppliedToLong"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_TOO_SOON_APPLIED_TO_LONG_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Of Unsecure Control Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeOfUnsecureControlAction[] VALUES_ARRAY = new TypeOfUnsecureControlAction[] { NOT_PROVIDED,
			PROVIDING_CAUSES_HAZARD, TO_EARLY_TO_LATE, STOP_TOO_SOON_APPLIED_TO_LONG, };

	/**
	 * A public read-only list of all the '<em><b>Type Of Unsecure Control Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeOfUnsecureControlAction> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Of Unsecure Control Action</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeOfUnsecureControlAction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOfUnsecureControlAction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Of Unsecure Control Action</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeOfUnsecureControlAction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOfUnsecureControlAction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Of Unsecure Control Action</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeOfUnsecureControlAction get(int value) {
		switch (value) {
		case NOT_PROVIDED_VALUE:
			return NOT_PROVIDED;
		case PROVIDING_CAUSES_HAZARD_VALUE:
			return PROVIDING_CAUSES_HAZARD;
		case TO_EARLY_TO_LATE_VALUE:
			return TO_EARLY_TO_LATE;
		case STOP_TOO_SOON_APPLIED_TO_LONG_VALUE:
			return STOP_TOO_SOON_APPLIED_TO_LONG;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeOfUnsecureControlAction(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //TypeOfUnsecureControlAction
