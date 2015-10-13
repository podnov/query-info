package com.evanzeimet.queryinfo.it.organizations;

/*
 * #%L
 * queryinfo-integration-tests
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2015 Evan Zeimet
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.evanzeimet.queryinfo.jpa.field.QueryInfoField;

@Entity
@Table(name = "organizations")
public class OrganizationEntity extends DefaultOrganization {

	@Override
	@QueryInfoField
	@Column(name = "active")
	public Boolean getActive() {
		return super.getActive();
	}

	@Override
	@QueryInfoField
	@Column(name = "address1")
	public String getAddress1() {
		return super.getAddress1();
	}

	@Override
	@QueryInfoField
	@Column(name = "address2")
	public String getAddress2() {
		return super.getAddress2();
	}

	@Override
	@QueryInfoField
	@Column(name = "city")
	public String getCity() {
		return super.getCity();
	}

	@Override
	@QueryInfoField
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Long getId() {
		return super.getId();
	}

	@Override
	@QueryInfoField
	@Column(name = "name")
	public String getName() {
		return super.getName();
	}

	@Override
	@QueryInfoField
	@Column(name = "state")
	public String getState() {
		return super.getState();
	}

	@Override
	@QueryInfoField
	@Column(name = "year_founded")
	public Integer getYearFounded() {
		return super.getYearFounded();
	}

	@Override
	@QueryInfoField
	@Column(name = "zip")
	public String getZip() {
		return super.getZip();
	}
}