/**
 */
package tau.systemengineering.STPAsec;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.ControlAction#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction()
 * @model
 * @generated
 */
public interface ControlAction extends DataFlow {

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Controller#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(Controller)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction_Receiver()
	 * @see tau.systemengineering.STPAsec.Controller#getCommands
	 * @model opposite="commands"
	 * @generated
	 */
	Controller getReceiver();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.ControlAction#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Controller value);
} // ControlAction
