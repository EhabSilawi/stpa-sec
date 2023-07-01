/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tau.systemengineering.STPAsec.STPAsecPackage
 * @generated
 */
public interface STPAsecFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	STPAsecFactory eINSTANCE = tau.systemengineering.STPAsec.impl.STPAsecFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>STPA Sec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>STPA Sec</em>'.
	 * @generated
	 */
	STPASec createSTPASec();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Control Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Structure</em>'.
	 * @generated
	 */
	ControlStructure createControlStructure();

	/**
	 * Returns a new object of class '<em>Controlled Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controlled Process</em>'.
	 * @generated
	 */
	ControlledProcess createControlledProcess();

	/**
	 * Returns a new object of class '<em>Control Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Action</em>'.
	 * @generated
	 */
	ControlAction createControlAction();

	/**
	 * Returns a new object of class '<em>Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback</em>'.
	 * @generated
	 */
	Feedback createFeedback();

	/**
	 * Returns a new object of class '<em>Other Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other Information</em>'.
	 * @generated
	 */
	OtherInformation createOtherInformation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	STPAsecPackage getSTPAsecPackage();

} //STPAsecFactory
