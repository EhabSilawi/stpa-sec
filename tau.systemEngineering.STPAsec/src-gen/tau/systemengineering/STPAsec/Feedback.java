/**
 */
package tau.systemengineering.STPAsec;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.Feedback#getType <em>Type</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Feedback#getController <em>Controller</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Feedback#getControlledProcess <em>Controlled Process</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback()
 * @model
 * @generated
 */
public interface Feedback extends DataFlow {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Feedback#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Controller#getFeedbacks <em>Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' reference.
	 * @see #setController(Controller)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback_Controller()
	 * @see tau.systemengineering.STPAsec.Controller#getFeedbacks
	 * @model opposite="feedbacks"
	 * @generated
	 */
	Controller getController();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Feedback#getController <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(Controller value);

	/**
	 * Returns the value of the '<em><b>Controlled Process</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlledProcess#getFeedbacks <em>Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled Process</em>' reference.
	 * @see #setControlledProcess(ControlledProcess)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback_ControlledProcess()
	 * @see tau.systemengineering.STPAsec.ControlledProcess#getFeedbacks
	 * @model opposite="feedbacks"
	 * @generated
	 */
	ControlledProcess getControlledProcess();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Feedback#getControlledProcess <em>Controlled Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlled Process</em>' reference.
	 * @see #getControlledProcess()
	 * @generated
	 */
	void setControlledProcess(ControlledProcess value);

} // Feedback
