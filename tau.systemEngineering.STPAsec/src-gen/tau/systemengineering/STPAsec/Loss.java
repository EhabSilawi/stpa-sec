/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loss</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.Loss#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Loss#getName <em>Name</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Loss#getTraceableTo <em>Traceable To</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getLoss()
 * @model
 * @generated
 */
public interface Loss extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getLoss_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Loss#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getLoss_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Loss#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Traceable To</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.SystemLevelHazard}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.SystemLevelHazard#getLeadsTo <em>Leads To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traceable To</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getLoss_TraceableTo()
	 * @see tau.systemengineering.STPAsec.SystemLevelHazard#getLeadsTo
	 * @model opposite="leadsTo" required="true"
	 * @generated
	 */
	EList<SystemLevelHazard> getTraceableTo();

} // Loss
