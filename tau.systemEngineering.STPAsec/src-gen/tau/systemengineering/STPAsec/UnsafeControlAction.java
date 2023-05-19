/**
 */
package tau.systemengineering.STPAsec;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unsafe Control Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.UnsafeControlAction#getHazard <em>Hazard</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getUnsafeControlAction()
 * @model
 * @generated
 */
public interface UnsafeControlAction extends ControlAction {
	/**
	 * Returns the value of the '<em><b>Hazard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard</em>' reference.
	 * @see #setHazard(Hazard)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getUnsafeControlAction_Hazard()
	 * @model
	 * @generated
	 */
	Hazard getHazard();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.UnsafeControlAction#getHazard <em>Hazard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazard</em>' reference.
	 * @see #getHazard()
	 * @generated
	 */
	void setHazard(Hazard value);

} // UnsafeControlAction
