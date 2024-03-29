# Task Master
Task Master helps run ASYNC tasks.

## Status
[![Build Status](https://github.com/BorderTech/java-taskmaster/actions/workflows/github-actions-build.yml/badge.svg)](https://github.com/BorderTech/java-taskmaster/actions/workflows/github-actions-build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=bordertech-java-taskmaster&metric=alert_status)](https://sonarcloud.io/dashboard?id=bordertech-java-taskmaster)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=bordertech-java-taskmaster&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=bordertech-java-taskmaster)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=bordertech-java-taskmaster&metric=coverage)](https://sonarcloud.io/dashboard?id=bordertech-java-taskmaster)
[![Javadocs](https://www.javadoc.io/badge/com.github.bordertech.taskmaster/taskmaster-core.svg)](https://www.javadoc.io/doc/com.github.bordertech.taskmaster/taskmaster-core)
[![Maven Central](https://img.shields.io/maven-central/v/com.github.bordertech.taskmaster/taskmaster-core.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.github.bordertech.taskmaster%22%20AND%20a:%22taskmaster-core%22)

## What is TaskMaster

Task Master allows a Runnable task to be submitted for execution and returns a Future representing that task. The
Future's `get` method will return the given result upon successful completion.

As Web applications require a `Future` implementation that can be serializable, the Task Master has a custom
interface of `TaskFuture` that implements both Future and Serializable. It does not make sense for a `Future`
 to be serilaizable as it is running on a specific thread on a particular server. To allow a Web Application to keep a
reference to the Future, the default implementation of TaskFuture (ie TaskFutureWrapper) wraps the future by
putting the `Future` on a cache and holding onto the cache key that is serializable.

## ServiceHelper
The `ServiceHelper` class helps applications submit ASYNC service calls.
