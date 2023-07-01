/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.ControlAction#getControllerCommandReceiver <em>Controller Command Receiver</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlAction#getControledProccessReceiverCommands <em>Controled Proccess Receiver Commands</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction()
 * @model
 * @generated
 */
public interface ControlAction extends ControlStructureElement {
	/**
	 * Returns the value of the '<em><b>Controller Command Receiver</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlStructure}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlStructure#getSendsCommands <em>Sends Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Command Receiver</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction_ControllerCommandReceiver()
	 * @see tau.systemengineering.STPAsec.ControlStructure#getSendsCommands
	 * @model opposite="sendsCommands"
	 * @generated
	 */
	EList<ControlStructure> getControllerCommandReceiver();

	/**
	 * Returns the value of the '<em><b>Controled Proccess Receiver Commands</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controled Proccess Receiver Commands</em>' reference.
	 * @see #setControledProccessReceiverCommands(ControlledProcess)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction_ControledProccessReceiverCommands()
	 * @model
	 * @generated
	 */
	ControlledProcess getControledProccessReceiverCommands();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.ControlAction#getControledProccessReceiverCommands <em>Controled Proccess Receiver Commands</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controled Proccess Receiver Commands</em>' reference.
	 * @see #getControledProccessReceiverCommands()
	 * @generated
	 */
	void setControledProccessReceiverCommands(ControlledProcess value);

} // ControlAction
