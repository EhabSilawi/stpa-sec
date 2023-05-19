/**
 */
package tau.systemengineering.STPAsec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import tau.systemengineering.STPAsec.LossScenario;
import tau.systemengineering.STPAsec.STPAsecPackage;
import tau.systemengineering.STPAsec.SecurityRecomendation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loss Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.LossScenarioImpl#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.LossScenarioImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.LossScenarioImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.LossScenarioImpl#getSolutions <em>Solutions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LossScenarioImpl extends MinimalEObjectImpl.Container implements LossScenario {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final String SEVERITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected String severity = SEVERITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSolutions() <em>Solutions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRecomendation> solutions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LossScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.LOSS_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.LOSS_SCENARIO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.LOSS_SCENARIO__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(String newSeverity) {
		String oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.LOSS_SCENARIO__SEVERITY, oldSeverity,
					severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRecomendation> getSolutions() {
		if (solutions == null) {
			solutions = new EObjectResolvingEList<SecurityRecomendation>(SecurityRecomendation.class, this,
					STPAsecPackage.LOSS_SCENARIO__SOLUTIONS);
		}
		return solutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case STPAsecPackage.LOSS_SCENARIO__ID:
			return getId();
		case STPAsecPackage.LOSS_SCENARIO__DESCRIPTION:
			return getDescription();
		case STPAsecPackage.LOSS_SCENARIO__SEVERITY:
			return getSeverity();
		case STPAsecPackage.LOSS_SCENARIO__SOLUTIONS:
			return getSolutions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case STPAsecPackage.LOSS_SCENARIO__ID:
			setId((Integer) newValue);
			return;
		case STPAsecPackage.LOSS_SCENARIO__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case STPAsecPackage.LOSS_SCENARIO__SEVERITY:
			setSeverity((String) newValue);
			return;
		case STPAsecPackage.LOSS_SCENARIO__SOLUTIONS:
			getSolutions().clear();
			getSolutions().addAll((Collection<? extends SecurityRecomendation>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case STPAsecPackage.LOSS_SCENARIO__ID:
			setId(ID_EDEFAULT);
			return;
		case STPAsecPackage.LOSS_SCENARIO__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case STPAsecPackage.LOSS_SCENARIO__SEVERITY:
			setSeverity(SEVERITY_EDEFAULT);
			return;
		case STPAsecPackage.LOSS_SCENARIO__SOLUTIONS:
			getSolutions().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case STPAsecPackage.LOSS_SCENARIO__ID:
			return id != ID_EDEFAULT;
		case STPAsecPackage.LOSS_SCENARIO__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case STPAsecPackage.LOSS_SCENARIO__SEVERITY:
			return SEVERITY_EDEFAULT == null ? severity != null : !SEVERITY_EDEFAULT.equals(severity);
		case STPAsecPackage.LOSS_SCENARIO__SOLUTIONS:
			return solutions != null && !solutions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", description: ");
		result.append(description);
		result.append(", severity: ");
		result.append(severity);
		result.append(')');
		return result.toString();
	}

} //LossScenarioImpl
