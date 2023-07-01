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
 *   <li>{@link tau.systemengineering.STPAsec.OtherInformation#getCcontrollerReceiverInfo <em>Ccontroller Receiver Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.OtherInformation#getControledProcessRecevierInfo <em>Controled Process Recevier Info</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getOtherInformation()
 * @model
 * @generated
 */
public interface OtherInformation extends ControlStructureElement {
	/**
	 * Returns the value of the '<em><b>Ccontroller Receiver Info</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlStructure}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlStructure#getControllerSendsInfo <em>Controller Sends Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ccontroller Receiver Info</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getOtherInformation_CcontrollerReceiverInfo()
	 * @see tau.systemengineering.STPAsec.ControlStructure#getControllerSendsInfo
	 * @model opposite="controllerSendsInfo"
	 * @generated
	 */
	EList<ControlStructure> getCcontrollerReceiverInfo();

	/**
	 * Returns the value of the '<em><b>Controled Process Recevier Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlledProcess#getControledProcessSendsInfo <em>Controled Process Sends Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controled Process Recevier Info</em>' reference.
	 * @see #setControledProcessRecevierInfo(ControlledProcess)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getOtherInformation_ControledProcessRecevierInfo()
	 * @see tau.systemengineering.STPAsec.ControlledProcess#getControledProcessSendsInfo
	 * @model opposite="controledProcessSendsInfo"
	 * @generated
	 */
	ControlledProcess getControledProcessRecevierInfo();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.OtherInformation#getControledProcessRecevierInfo <em>Controled Process Recevier Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controled Process Recevier Info</em>' reference.
	 * @see #getControledProcessRecevierInfo()
	 * @generated
	 */
	void setControledProcessRecevierInfo(ControlledProcess value);

} // OtherInformation
