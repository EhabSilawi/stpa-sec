/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.OtherInformation#getControllerSenders <em>Controller Senders</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.OtherInformation#getControledProcessSenders <em>Controled Process Senders</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.OtherInformation#getControledProcessReceivers <em>Controled Process Receivers</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.OtherInformation#getControllerReceivers <em>Controller Receivers</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.OtherInformation#getSubsystemSenders <em>Subsystem Senders</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.OtherInformation#getSubsystemReceivers <em>Subsystem Receivers</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getOtherInformation()
 * @model
 * @generated
 */
public interface OtherInformation extends ControlStructureElement {
	/**
	 * Returns the value of the '<em><b>Controller Senders</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Controller}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Controller#getSendsInfo <em>Sends Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Senders</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getOtherInformation_ControllerSenders()
	 * @see tau.systemengineering.STPAsec.Controller#getSendsInfo
	 * @model opposite="sendsInfo"
	 * @generated
	 */
	EList<Controller> getControllerSenders();

	/**
	 * Returns the value of the '<em><b>Controled Process Senders</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlledProcess}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlledProcess#getSendsInfo <em>Sends Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controled Process Senders</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getOtherInformation_ControledProcessSenders()
	 * @see tau.systemengineering.STPAsec.ControlledProcess#getSendsInfo
	 * @model opposite="sendsInfo"
	 * @generated
	 */
	EList<ControlledProcess> getControledProcessSenders();

	/**
	 * Returns the value of the '<em><b>Controled Process Receivers</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlledProcess}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlledProcess#getReceivesInfo <em>Receives Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controled Process Receivers</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getOtherInformation_ControledProcessReceivers()
	 * @see tau.systemengineering.STPAsec.ControlledProcess#getReceivesInfo
	 * @model opposite="receivesInfo"
	 * @generated
	 */
	EList<ControlledProcess> getControledProcessReceivers();

	/**
	 * Returns the value of the '<em><b>Controller Receivers</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Controller}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Controller#getReceivesInfo <em>Receives Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Receivers</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getOtherInformation_ControllerReceivers()
	 * @see tau.systemengineering.STPAsec.Controller#getReceivesInfo
	 * @model opposite="receivesInfo"
	 * @generated
	 */
	EList<Controller> getControllerReceivers();

	/**
	 * Returns the value of the '<em><b>Subsystem Senders</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlStructure}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlStructure#getSwndsInfor <em>Swnds Infor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystem Senders</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getOtherInformation_SubsystemSenders()
	 * @see tau.systemengineering.STPAsec.ControlStructure#getSwndsInfor
	 * @model opposite="swndsInfor"
	 * @generated
	 */
	EList<ControlStructure> getSubsystemSenders();

	/**
	 * Returns the value of the '<em><b>Subsystem Receivers</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlStructure#getReceivesInfo <em>Receives Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystem Receivers</em>' reference.
	 * @see #setSubsystemReceivers(ControlStructure)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getOtherInformation_SubsystemReceivers()
	 * @see tau.systemengineering.STPAsec.ControlStructure#getReceivesInfo
	 * @model opposite="receivesInfo"
	 * @generated
	 */
	ControlStructure getSubsystemReceivers();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.OtherInformation#getSubsystemReceivers <em>Subsystem Receivers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsystem Receivers</em>' reference.
	 * @see #getSubsystemReceivers()
	 * @generated
	 */
	void setSubsystemReceivers(ControlStructure value);

} // OtherInformation
