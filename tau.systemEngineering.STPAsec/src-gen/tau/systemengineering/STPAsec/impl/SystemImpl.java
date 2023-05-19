/**
 */
package tau.systemengineering.STPAsec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tau.systemengineering.STPAsec.ControlStructure;
import tau.systemengineering.STPAsec.LossScenario;
import tau.systemengineering.STPAsec.MissionGoal;
import tau.systemengineering.STPAsec.STPAsecPackage;
import tau.systemengineering.STPAsec.SecurityRecomendation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getRecomends <em>Recomends</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getConsistsOf <em>Consists Of</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements tau.systemengineering.STPAsec.System {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecomends() <em>Recomends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecomends()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRecomendation> recomends;

	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<MissionGoal> goals;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected EList<LossScenario> scenario;

	/**
	 * The cached value of the '{@link #getConsistsOf() <em>Consists Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistsOf()
	 * @generated
	 * @ordered
	 */
	protected ControlStructure consistsOf;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRecomendation> getRecomends() {
		if (recomends == null) {
			recomends = new EObjectContainmentEList<SecurityRecomendation>(SecurityRecomendation.class, this,
					STPAsecPackage.SYSTEM__RECOMENDS);
		}
		return recomends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MissionGoal> getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentEList<MissionGoal>(MissionGoal.class, this, STPAsecPackage.SYSTEM__GOALS);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LossScenario> getScenario() {
		if (scenario == null) {
			scenario = new EObjectContainmentEList<LossScenario>(LossScenario.class, this,
					STPAsecPackage.SYSTEM__SCENARIO);
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlStructure getConsistsOf() {
		return consistsOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsistsOf(ControlStructure newConsistsOf, NotificationChain msgs) {
		ControlStructure oldConsistsOf = consistsOf;
		consistsOf = newConsistsOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.SYSTEM__CONSISTS_OF, oldConsistsOf, newConsistsOf);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsistsOf(ControlStructure newConsistsOf) {
		if (newConsistsOf != consistsOf) {
			NotificationChain msgs = null;
			if (consistsOf != null)
				msgs = ((InternalEObject) consistsOf).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - STPAsecPackage.SYSTEM__CONSISTS_OF, null, msgs);
			if (newConsistsOf != null)
				msgs = ((InternalEObject) newConsistsOf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - STPAsecPackage.SYSTEM__CONSISTS_OF, null, msgs);
			msgs = basicSetConsistsOf(newConsistsOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.SYSTEM__CONSISTS_OF, newConsistsOf,
					newConsistsOf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.SYSTEM__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STPAsecPackage.SYSTEM__RECOMENDS:
			return ((InternalEList<?>) getRecomends()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__GOALS:
			return ((InternalEList<?>) getGoals()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__SCENARIO:
			return ((InternalEList<?>) getScenario()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__CONSISTS_OF:
			return basicSetConsistsOf(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case STPAsecPackage.SYSTEM__NAME:
			return getName();
		case STPAsecPackage.SYSTEM__RECOMENDS:
			return getRecomends();
		case STPAsecPackage.SYSTEM__GOALS:
			return getGoals();
		case STPAsecPackage.SYSTEM__SCENARIO:
			return getScenario();
		case STPAsecPackage.SYSTEM__CONSISTS_OF:
			return getConsistsOf();
		case STPAsecPackage.SYSTEM__DESCRIPTION:
			return getDescription();
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
		case STPAsecPackage.SYSTEM__NAME:
			setName((String) newValue);
			return;
		case STPAsecPackage.SYSTEM__RECOMENDS:
			getRecomends().clear();
			getRecomends().addAll((Collection<? extends SecurityRecomendation>) newValue);
			return;
		case STPAsecPackage.SYSTEM__GOALS:
			getGoals().clear();
			getGoals().addAll((Collection<? extends MissionGoal>) newValue);
			return;
		case STPAsecPackage.SYSTEM__SCENARIO:
			getScenario().clear();
			getScenario().addAll((Collection<? extends LossScenario>) newValue);
			return;
		case STPAsecPackage.SYSTEM__CONSISTS_OF:
			setConsistsOf((ControlStructure) newValue);
			return;
		case STPAsecPackage.SYSTEM__DESCRIPTION:
			setDescription((String) newValue);
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
		case STPAsecPackage.SYSTEM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case STPAsecPackage.SYSTEM__RECOMENDS:
			getRecomends().clear();
			return;
		case STPAsecPackage.SYSTEM__GOALS:
			getGoals().clear();
			return;
		case STPAsecPackage.SYSTEM__SCENARIO:
			getScenario().clear();
			return;
		case STPAsecPackage.SYSTEM__CONSISTS_OF:
			setConsistsOf((ControlStructure) null);
			return;
		case STPAsecPackage.SYSTEM__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case STPAsecPackage.SYSTEM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case STPAsecPackage.SYSTEM__RECOMENDS:
			return recomends != null && !recomends.isEmpty();
		case STPAsecPackage.SYSTEM__GOALS:
			return goals != null && !goals.isEmpty();
		case STPAsecPackage.SYSTEM__SCENARIO:
			return scenario != null && !scenario.isEmpty();
		case STPAsecPackage.SYSTEM__CONSISTS_OF:
			return consistsOf != null;
		case STPAsecPackage.SYSTEM__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
