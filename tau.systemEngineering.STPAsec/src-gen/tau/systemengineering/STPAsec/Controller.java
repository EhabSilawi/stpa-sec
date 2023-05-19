/**
 */
package tau.systemengineering.STPAsec;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getType <em>Type</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getFeadback <em>Feadback</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends StructureElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Controller#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Feadback</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Feedback#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feadback</em>' reference.
	 * @see #setFeadback(Feedback)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_Feadback()
	 * @see tau.systemengineering.STPAsec.Feedback#getReceiver
	 * @model opposite="receiver"
	 * @generated
	 */
	Feedback getFeadback();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Controller#getFeadback <em>Feadback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feadback</em>' reference.
	 * @see #getFeadback()
	 * @generated
	 */
	void setFeadback(Feedback value);

} // Controller
